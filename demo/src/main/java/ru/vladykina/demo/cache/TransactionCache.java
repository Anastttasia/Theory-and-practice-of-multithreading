package ru.vladykina.demo.cache;

import ru.vladykina.demo.data.TransferGeneratorService;

import java.util.Collection;

public interface TransactionCache {

    void addTransaction(String accNum, TransferGeneratorService.TransferOperation op);
    Collection<TransferGeneratorService.TransferOperation> getLastTransactions(String accNum);
}
