package co.com.tallergrupo7.model;

import lombok.Data;

import java.util.List;

@Data
public class BalancesRequest {

    private List<BalancesRequestData> data;
}
