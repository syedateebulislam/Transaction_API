package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Response {
	@Id	
	private int transactionReference;

    private String errorReference;
	
    private String errorDescription;
    
	public String getErrorReference() {
		return errorReference;
	}

	public void setErrorReference(String errorReference) {
		this.errorReference = errorReference;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public int getTransactionReference() {
		return transactionReference;
	}

	public void setTransactionReference(int transactionReference) {
		this.transactionReference = transactionReference;
	}

	@Override
	public String toString() {
		return "Response [transactionReference=" + transactionReference + ", errorReference=" + errorReference
				+ ", errorDescription=" + errorDescription + "]";
	}
    
}