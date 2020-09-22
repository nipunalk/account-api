package com.igreendata.accountapi.web.controller.integration;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.igreendata.accountapi.model.Account;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AccountControllerIT {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	@DisplayName("Integration test for account list api ")
	void getAllAcconts() {
		Account[] account = this.restTemplate.getForObject("/account", Account[].class);
		assertEquals(5, account.length);
	}

}
