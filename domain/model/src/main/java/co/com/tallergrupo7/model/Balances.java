package co.com.tallergrupo7.model;

import lombok.Data;

@Data
public class Balances {
    private float available;
    private float availableOverdraftBalance;
    private float overdraftValue;
    private float availableOverdraftQuota;
    private float cash;
    private float clearing;
    private float receivable;
    private float blocked;
    private float clearingStartDay;
    private float cashStartDay;
    private float pockets;
    private float remittanceQuota;
    private float agreedRemittanceQuota;
    private float remittanceQuotaUsage;
    private float normalInterest;
    private float suspensionInterest;
}
