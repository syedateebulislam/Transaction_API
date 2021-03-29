package com.app.model;

import javax.persistence.*;


@Entity
public class Payment {

	@Id
    private long TransactionId;

    private int amount;

	private String date;
    
    private String time;

    private String remarks;

    @OneToOne
    private DebitorDetails debitorDetails;

	@OneToOne
    private CreditorDetails creditorDetails;

    public DebitorDetails getDebitorDetails() {
		return debitorDetails;
	}

	public void setDebitorDetails(DebitorDetails debitorDetails) {
		this.debitorDetails = debitorDetails;
	}

	public CreditorDetails getCreditorDetails() {
		return creditorDetails;
	}

	public void setCreditorDetails(CreditorDetails creditorDetails) {
		this.creditorDetails = creditorDetails;
	}

	public long getTransactionId() {
		return TransactionId;
	}

	public void setTransactionId(long transactionId) {
		TransactionId = transactionId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "Payment [TransactionId=" + TransactionId + ", amount=" + amount + ", date=" + date + ", time=" + time
				+ ", remarks=" + remarks + ", debitorDetails=" + debitorDetails + ", creditorDetails=" + creditorDetails
				+ "]";
	}    
}