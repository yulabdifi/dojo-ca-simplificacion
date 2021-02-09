package co.com.tallergrupo7.restclient.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RetrieveBalanceResponseData {

    private AccountBalance account;
}
