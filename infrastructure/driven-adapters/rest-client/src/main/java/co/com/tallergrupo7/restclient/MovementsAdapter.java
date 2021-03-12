package co.com.tallergrupo7.restclient;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import co.com.tallergrupo7.model.BalancesRequestData;
import co.com.tallergrupo7.model.Movement;
import co.com.tallergrupo7.model.gateways.MovementsGateway;
import co.com.tallergrupo7.restclient.model.Pagination;
import co.com.tallergrupo7.restclient.model.RetrieveTransactionRequest;
import co.com.tallergrupo7.restclient.model.RetrieveTransactionRequestData;
import co.com.tallergrupo7.restclient.model.RetrieveTransactionResponse;
import co.com.tallergrupo7.restclient.model.Transaction;
import co.com.tallergrupo7.restclient.model.Transaction.TransactionBuilder;
import reactor.core.publisher.Mono;

@Component
public class MovementsAdapter implements MovementsGateway {

	private static final String HEADER_TRANSACTION_TRACKER = "Transaction-Tracker";

	@Value("${url.movements}")
	private String url;

	public Mono<List<Movement>> consultMovements(BalancesRequestData balancesRequestData) {

		TransactionBuilder transaction = Transaction.builder();
		if (balancesRequestData != null && balancesRequestData.getFilter() != null) {
			transaction.description(balancesRequestData.getFilter().getDescription())
					.startDate(balancesRequestData.getFilter().getStartDate())
					.endDate(balancesRequestData.getFilter().getEndDate());
		}

		RetrieveTransactionRequestData data = RetrieveTransactionRequestData.builder()
				.pagination(Pagination.builder().size(20).key(1).build()).account(balancesRequestData.getAccount())
				.transaction(transaction.build()).build();
		List<RetrieveTransactionRequestData> datals = new ArrayList<>();
		datals.add(data);
		RetrieveTransactionRequest request = RetrieveTransactionRequest.builder().data(datals).build();

		return WebClient.create(url).post().header(HEADER_TRANSACTION_TRACKER, UUID.randomUUID().toString())
				.contentType(MediaType.APPLICATION_JSON).body(Mono.just(request), RetrieveTransactionRequest.class).retrieve()
				.bodyToMono(RetrieveTransactionResponse.class).flatMapIterable(RetrieveTransactionResponse::getData).next().getTransaction());

	}
}
