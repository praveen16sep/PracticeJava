package com.java8code;

public class Transaction {
	
	public String date;
	public int amount;
	
	public Transaction(String string, int i) {
		this.date=string;
		this.amount=i;
	}


	public String getDate() {
		return date;
	}



	public void setDate(String transactionDate) {
		this.date = transactionDate;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "Transaction [transactionDate=" + date + ", amount=" + amount + "]";
	}



}
