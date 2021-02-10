package co.com.tallergrupo7.model;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BalancesMovement {

	private Balances balances;
	private List<Movement> movements;
}
