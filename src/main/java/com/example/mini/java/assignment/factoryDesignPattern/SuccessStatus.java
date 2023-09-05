package com.example.mini.java.assignment.factoryDesignPattern;

import com.example.mini.java.assignment.model.Entity;

public class SuccessStatus {
	public void process(Entity entity) {
		System.out.println("AccountNumber :" + entity.getAccountNumber());
		System.out.println("TransactionId :" + entity.getTransactionId());
		System.out.println("Amount :" + entity.getAmount());
		System.out.println("Status :" + "Success");
		System.out.println("Date : " + entity.getDate());

	}

}
