package co.com.tallergrupo7.model;

import lombok.Data;

@Data
public class TransactionFilter {
	private String startDate;
    private String endDate;
    private String description;
}
