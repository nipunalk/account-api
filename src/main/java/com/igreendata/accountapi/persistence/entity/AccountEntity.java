package com.igreendata.accountapi.persistence.entity;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class AccountEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "account_id")
	private long accountId;
	@Column(name = "account_number")
	private String accountNumber;
	@Column(name = "account_name")
	private String accountName;
	@Column(name = "account_type")
	private String accountType;
	@Column(name = "balance_date")
	private Date balanceDate;
	@Column(name = "currency")
	private String currency;
	@Column(name = "opening_available_balance")
	private Double openingAvailableBalance;

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

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

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getOpeningAvailableBalance() {
		return openingAvailableBalance;
	}

	public void setOpeningAvailableBalance(Double openingAvailableBalance) {
		this.openingAvailableBalance = openingAvailableBalance;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		AccountEntity that = (AccountEntity) o;
		return accountId == that.accountId && Objects.equals(accountNumber, that.accountNumber)
				&& Objects.equals(accountName, that.accountName) && Objects.equals(accountType, that.accountType)
				&& Objects.equals(balanceDate, that.balanceDate) && Objects.equals(currency, that.currency)
				&& Objects.equals(openingAvailableBalance, that.openingAvailableBalance);
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountId, accountNumber, accountName, accountType, balanceDate, currency,
				openingAvailableBalance);
	}
}
