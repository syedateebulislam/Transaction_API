package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//@Entity
public class ResponseMessage {

//	@OneToOne
    private Status status;
    
//	@OneToOne
	private Response response;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "ResponseMessage [status=" + status + ", response=" + response + "]";
	}
	    
}
