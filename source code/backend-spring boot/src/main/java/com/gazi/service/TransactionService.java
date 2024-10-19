package com.gazi.service;

import com.gazi.model.Order;
import com.gazi.model.Seller;
import com.gazi.model.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction createTransaction(Order order);
    List<Transaction> getTransactionBySeller(Seller seller);
    List<Transaction>getAllTransactions();
}
