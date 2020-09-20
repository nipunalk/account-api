package com.igreendata.accountapi.persistence.entity;

import javax.persistence.*;



import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "transaction")
public class TransactionEntity {
	@Id
    @Column(name = "transaction_id")
    private long transactionId;
	@Column(name = "account_number")
    private String accountNumber;
	@Column(name = "account_name")
    private String accountName;
    @Column(name = "value_date")
    private Date valueDate;
    @Column(name = "currency")
    private String currency;
    @Column(name = "debit_amount")
    private Double debitAmount;
    @Column(name = "credit_amount")
    private Double creditAmount;
    @Column(name = "credit_debit")
    private String creditDebit;
    @Column(name = "transaction_narative")
    private String transactionNarative;
    @ManyToOne
	@JoinColumn(name="account_id")
	private AccountEntity accountEntity;

    
    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
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
    
    

 
	public AccountEntity getAccountEntity() {
		return accountEntity;
	}

	public void setAccountEntity(AccountEntity accountEntity) {
		this.accountEntity = accountEntity;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionEntity that = (TransactionEntity) o;
        return transactionId == that.transactionId &&
                Objects.equals(accountNumber, that.accountNumber) &&
                Objects.equals(accountName, that.accountName) &&
                Objects.equals(valueDate, that.valueDate) &&
                Objects.equals(currency, that.currency) &&
                Objects.equals(debitAmount, that.debitAmount) &&
                Objects.equals(creditAmount, that.creditAmount) &&
                Objects.equals(creditDebit, that.creditDebit) &&
                Objects.equals(transactionNarative, that.transactionNarative);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, accountNumber, accountName, valueDate, currency, debitAmount, creditAmount, creditDebit, transactionNarative);
    }
}
