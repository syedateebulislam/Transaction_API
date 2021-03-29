package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Status {
	@Id
    private int successFlag;

	public int getSuccessFlag() {
		return successFlag;
	}

	public void setSuccessFlag(int successFlag) {
		this.successFlag = successFlag;
	}

	@Override
	public String toString() {
		return "Status [successFlag=" + successFlag + "]";
	}
	
}
