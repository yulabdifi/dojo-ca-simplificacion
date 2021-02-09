package co.com.tallergrupo7.restclient.model;

import co.com.tallergrupo7.model.Account;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RetrieveBalanceRequestData {

	private Account account;

}
