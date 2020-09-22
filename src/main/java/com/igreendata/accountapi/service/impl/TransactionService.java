package com.igreendata.accountapi.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igreendata.accountapi.model.Transaction;
import com.igreendata.accountapi.persistence.entity.TransactionEntity;
import com.igreendata.accountapi.persistence.repository.TransactionRepository;
import com.igreendata.accountapi.service.ITransactionService;

@Service
public class TransactionService implements ITransactionService {

	private static final Logger log = LoggerFactory.getLogger(TransactionService.class);

	@Autowired
	TransactionRepository transactionRepository;

	@Autowired
	private ModelMapper modelMapper;

	public List<Transaction> getTransaList(Long accountId) {
		log.debug("Retrive all transaction for account {}",accountId);
		List<TransactionEntity> accounts = transactionRepository.findByAccount(accountId);
		return accounts.stream().map(this::convertToModel).collect(Collectors.toList());
	}

	private Transaction convertToModel(TransactionEntity transactionEntity) {
		log.debug("convert to transaction model for account {}",transactionEntity.getAccountNumber());
		Transaction transaction = modelMapper.map(transactionEntity, Transaction.class);
		return transaction;
	}

}
