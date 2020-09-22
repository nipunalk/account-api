package com.igreendata.accountapi.web.controller;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.igreendata.accountapi.model.Transaction;
import com.igreendata.accountapi.service.impl.TransactionService;

@WebMvcTest(controllers = TransactionController.class)
@AutoConfigureMockMvc
@Import({ ModelMapper.class })
public class TransactionControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private TransactionService transactionService;

	@Test
	public void sholudGetAllTransaction() throws Exception {
		when(transactionService.getTransaList(1l)).thenReturn(getSampletTransactiontList());
		mockMvc.perform(get("/account/{accountId}/trasaction", "1").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$._embedded.transactionList", hasSize(1)));
	}

	@Test
	public void sholudReturn404ForEmptytransactions() throws Exception {
		when(transactionService.getTransaList(2l)).thenReturn(new ArrayList<Transaction>());
		mockMvc.perform(get("/account/{accountId}/trasaction", "1").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isNotFound());
	}

	private List<Transaction> getSampletTransactiontList() {
		List<Transaction> transactions = new ArrayList<Transaction>();
		Transaction transaction=new Transaction();
		transaction.setAccountNumber("585309209");
		transaction.setAccountName("SGsaving123");
		transaction.setCreditAmount(10000.00);
		transactions.add(transaction);
		return transactions;
	}

}
