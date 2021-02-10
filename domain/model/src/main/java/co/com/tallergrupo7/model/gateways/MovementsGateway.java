package co.com.tallergrupo7.model.gateways;

import java.util.List;

import co.com.tallergrupo7.model.BalancesRequestData;
import co.com.tallergrupo7.model.Movement;
import reactor.core.publisher.Mono;

public interface MovementsGateway {

	public Mono<List<Movement>> consultMovements(BalancesRequestData balancesRequestData);

}
