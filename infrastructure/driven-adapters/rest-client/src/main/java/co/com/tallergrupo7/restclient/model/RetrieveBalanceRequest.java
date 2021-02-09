package co.com.tallergrupo7.restclient.model;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RetrieveBalanceRequest {

    private List<RetrieveBalanceRequestData> data;
}
