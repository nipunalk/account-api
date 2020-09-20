package com.igreendata.accountapi.service;

import java.util.List;

import com.igreendata.accountapi.model.Transaction;

public interface ITransactionService {

	public List<Transaction> getTransaList(Long accountId);

}
