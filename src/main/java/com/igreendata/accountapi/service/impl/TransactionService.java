package com.igreendata.accountapi.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igreendata.accountapi.model.Transaction;
import com.igreendata.accountapi.persistence.entity.TransactionEntity;
import com.igreendata.accountapi.persistence.repository.TransactionRepository;
import com.igreendata.accountapi.service.ITransactionService;

@Service
public class TransactionService implements ITransactionService {

	@Autowired
	TransactionRepository transactionRepository;

	@Autowired
	private ModelMapper modelMapper;

	public List<Transaction> getTransaList(Long accountId) {
		List<TransactionEntity> accounts = transactionRepository.findByAccount(accountId);
		return accounts.stream().map(this::convertToModel).collect(Collectors.toList());
	}

	private Transaction convertToModel(TransactionEntity transactionEntity) {
		Transaction transaction = modelMapper.map(transactionEntity, Transaction.class);
		return transaction;
	}

}
