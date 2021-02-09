package co.com.tallergrupo7.restclient.model;

import lombok.Data;

import java.util.List;
@Data
public class RetrieveBalanceResponse {

    private List<RetrieveBalanceResponseData> data;
}
