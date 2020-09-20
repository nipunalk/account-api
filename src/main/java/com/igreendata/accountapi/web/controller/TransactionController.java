package com.igreendata.accountapi.web.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igreendata.accountapi.model.Transaction;
import com.igreendata.accountapi.service.impl.TransactionService;

@RestController

@RequestMapping("/account/{accountId}/")
public class TransactionController {

	@Autowired
	TransactionService transactionService;

	@GetMapping("trasaction")
	public ResponseEntity<CollectionModel<Transaction>> getAccountTransactions(
			@PathVariable("accountId") Long accountId) {
		List<Transaction> transactions = transactionService.getTransaList(accountId);

		Link link = linkTo(methodOn(AccountController.class).getAllAccounts()).withRel("acount");
		final CollectionModel<Transaction> resources = CollectionModel.of(transactions, link);
		return new ResponseEntity<CollectionModel<Transaction>>(resources, new HttpHeaders(), HttpStatus.OK);

	}
}