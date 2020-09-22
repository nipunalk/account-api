package com.igreendata.accountapi.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igreendata.accountapi.persistence.entity.AccountEntity;
import com.igreendata.accountapi.persistence.repository.AccountRepository;
import com.igreendata.accountapi.service.IAccountService;

@Service
public class AccountService implements IAccountService {
	 private static final Logger log = LoggerFactory.getLogger(AccountService.class);


	@Autowired
	AccountRepository accountRepository;

	public List<AccountEntity> getAccountList() {
		log.debug("Retrive all accounts..");
		return accountRepository.findAll();

	}

}
