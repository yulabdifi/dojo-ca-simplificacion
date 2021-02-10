package co.com.tallergrupo7.model;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BalancesResponse {

	private List<BalancesMovement> data;
}
