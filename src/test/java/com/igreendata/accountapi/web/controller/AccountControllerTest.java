package com.igreendata.accountapi.web.controller;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.sql.Date;
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

import com.igreendata.accountapi.persistence.entity.AccountEntity;
import com.igreendata.accountapi.service.impl.AccountService;

@WebMvcTest(controllers = AccountController.class)
@AutoConfigureMockMvc
@Import({ ModelMapper.class })
public class AccountControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private AccountService accountService;

	@Test
	public void sholudGetAllAccounts() throws Exception {
		when(accountService.getAccountList()).thenReturn(getSampleAccountList());
		mockMvc.perform(get("/account").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$", hasSize(2)));
	}

	@Test
	public void sholudReturn404ForEmptyAccounts() throws Exception {
		when(accountService.getAccountList()).thenReturn(new ArrayList<AccountEntity>());
		mockMvc.perform(get("/account").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isNotFound());
	}

	private List<AccountEntity> getSampleAccountList() {
		List<AccountEntity> accountEntities = new ArrayList<AccountEntity>();
		AccountEntity accountEntity1 = new AccountEntity();
		accountEntity1.setAccountId(1L);
		accountEntity1.setAccountNumber("585309209");
		accountEntity1.setAccountName("SGsaving123");
		accountEntity1.setAccountType("Saving");
		accountEntity1.setBalanceDate(new Date(System.currentTimeMillis()));
		accountEntity1.setCurrency("AUD");
		accountEntity1.setOpeningAvailableBalance(80800.0);

		AccountEntity accountEntity2 = new AccountEntity();
		accountEntity2.setAccountId(2L);
		accountEntity2.setAccountNumber("685309209");
		accountEntity2.setAccountName("SGsaving234");
		accountEntity2.setAccountType("Saving");
		accountEntity2.setBalanceDate(new Date(System.currentTimeMillis()));
		accountEntity2.setCurrency("AUD");
		accountEntity2.setOpeningAvailableBalance(90800.0);

		accountEntities.add(accountEntity1);
		accountEntities.add(accountEntity2);
		return accountEntities;
	}

}
