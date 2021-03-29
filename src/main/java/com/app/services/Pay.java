package com.app.services;

import java.util.Random;

import com.app.model.Payment;

public class Pay {
	
	//create one row in each credit transfer related tables
		
	//return with unique txn_pos_num
	
	public Payment CreateTxn(Payment payment) {
		
		Random r=new Random();
		
		int TxnRefNum=r.nextInt();
		
		return new Payment();
	}
}
