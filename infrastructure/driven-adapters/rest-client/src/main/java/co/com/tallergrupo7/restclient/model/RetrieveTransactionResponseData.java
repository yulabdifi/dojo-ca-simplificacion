package co.com.tallergrupo7.restclient.model;

import java.util.List;

import co.com.tallergrupo7.model.Account;
import co.com.tallergrupo7.model.Movement;
import lombok.Data;

@Data
public class RetrieveTransactionResponseData {

    private List<Movement> transaction;
    private Office office;
    private Account relatedTransferAccount;
    private int _responseSize;
    private boolean _flagMoreRecords;

}
