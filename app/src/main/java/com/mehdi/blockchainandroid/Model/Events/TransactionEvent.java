package com.mehdi.blockchainandroid.Model.Events;

import com.mehdi.blockchainandroid.Model.POJOs.Transaction;

public class TransactionEvent
{
    Transaction transactions;

    public Transaction getTransactions() {
        return transactions;
    }

    public TransactionEvent(Transaction transactions)
    {
        this.transactions = transactions;
    }
}
