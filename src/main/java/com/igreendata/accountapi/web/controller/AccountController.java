package com.igreendata.accountapi.web.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igreendata.accountapi.model.Account;
import com.igreendata.accountapi.persistence.entity.AccountEntity;
import com.igreendata.accountapi.service.impl.AccountService;
import com.igreendata.accountapi.web.controller.exception.NotFoundException;

@RestController

@RequestMapping("/account")
public class AccountController {
	private static final Logger log = LoggerFactory.getLogger(AccountController.class);


	@Autowired
	AccountService accountService;
	

	@Autowired
	private ModelMapper modelMapper;

	@GetMapping
	public ResponseEntity<List<Account>> getAllAccounts() {
		log.info("get all accounts");
		List<Account> accounts = new ArrayList<Account>();
		List<AccountEntity> accountEntities = accountService.getAccountList();
		log.info("get {} accounts",accountEntities.size());
		if (isAccountsExist(accountEntities)) {
			accounts = accountEntities.stream().map(this::convertToModel).collect(Collectors.toList());
		} else {
			log.info("no account available");
			throw new NotFoundException("Accounts not found");
		}

		return new ResponseEntity<List<Account>>(accounts, new HttpHeaders(), HttpStatus.OK);
	}

	private Account convertToModel(AccountEntity accountEntity) {
		Account account = modelMapper.map(accountEntity, Account.class);
		account.add(linkTo(methodOn(TransactionController.class).getAccountTransactions(account.getAccountId()))
				.withRel("transaction"));
		return account;
	}

	private boolean isAccountsExist(List<AccountEntity> accounts) {
		return accounts.size() > 0;
	}

}
