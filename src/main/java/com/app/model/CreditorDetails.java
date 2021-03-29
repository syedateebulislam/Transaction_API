package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CreditorDetails {

	@Id
	private int customerId;
	
	private String name;
    
	private String branchId;
	
	private int creditorAccountNum;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public int getDebitorAccountNum() {
		return creditorAccountNum;
	}

	public void setDebitorAccountNum(int debitorAccountNum) {
		this.creditorAccountNum = debitorAccountNum;
	}

	@Override
	public String toString() {
		return "DebitorDetails [customerId=" + customerId + ", name=" + name + ", branchId=" + branchId
				+ ", debitorAccountNum=" + creditorAccountNum + "]";
	}

	
}

