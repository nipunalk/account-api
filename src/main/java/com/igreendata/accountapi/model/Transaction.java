package com.igreendata.accountapi.model;

import java.sql.Date;

import org.springframework.hateoas.RepresentationModel;

public class Transaction extends RepresentationModel<Transaction> {

	private String accountNumber;
	private String accountName;
	private Date valueDate;
	private String currency;
	private Double debitAmount;
	private Double creditAmount;
	private String creditDebit;
	private String transactionNarative;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Date getValueDate() {
		return valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getDebitAmount() {
		return debitAmount;
	}

	public void setDebitAmount(Double debitAmount) {
		this.debitAmount = debitAmount;
	}

	public Double getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(Double creditAmount) {
		this.creditAmount = creditAmount;
	}

	public String getCreditDebit() {
		return creditDebit;
	}

	public void setCreditDebit(String creditDebit) {
		this.creditDebit = creditDebit;
	}

	public String getTransactionNarative() {
		return transactionNarative;
	}

	public void setTransactionNarative(String transactionNarative) {
		this.transactionNarative = transactionNarative;
	}

}
