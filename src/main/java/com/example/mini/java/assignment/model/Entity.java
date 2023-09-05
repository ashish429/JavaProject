package com.example.mini.java.assignment.model;

import java.text.DateFormat;

import org.springframework.stereotype.Component;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Component
@Table(name = "entity")
@JacksonXmlRootElement(localName = "entity")
public class Entity {

	@Column(name = "accountNumber")
	private int accountNumber;

	@Column(name = "transactionId")
	private int transactionId;

	@Column(name = "status")
	private String status;

	@Column(name = "amount")
	private double amount;

	@Column(name = "date")
	private DateFormat date;

	public Entity() {
		super();
	}

	public Entity(int accountNumber, int transactionId, String status, double amount, DateFormat date) {
		super();
		this.accountNumber = accountNumber;
		this.transactionId = transactionId;
		this.status = status;
		this.amount = amount;
		this.date = date;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public DateFormat getDate() {
		return date;
	}

	public void setDate(DateFormat date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Entity [accountNumber=" + accountNumber + ", transactionId=" + transactionId + ", status=" + status
				+ ", amount=" + amount + ", date=" + date + "]";
	}

}
