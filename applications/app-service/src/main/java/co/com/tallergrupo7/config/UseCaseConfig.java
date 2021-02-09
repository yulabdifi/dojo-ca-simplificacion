package co.com.tallergrupo7.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.com.tallergrupo7.model.gateways.BalancesGateway;
import co.com.tallergrupo7.model.gateways.MovementsGateway;
import co.com.tallergrupo7.usecase.balancemovement.BalanceMovementUseCase;

@Configuration
public class UseCaseConfig {

	@Bean
	public BalanceMovementUseCase balancesMovementsUseCase(BalancesGateway balancesGateway,
			MovementsGateway movementsGateway) {
		return new BalanceMovementUseCase(balancesGateway, movementsGateway);
	}

}
