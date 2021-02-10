package co.com.tallergrupo7.model;

import lombok.Data;

@Data
public class BalancesRequestData {

	private Account account;
	private TransactionFilter filter;

}
