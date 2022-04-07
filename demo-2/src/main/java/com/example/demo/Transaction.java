package com.example.demo;

public class Transaction {
	
	int id;
	double amount;
	String mode;
	char type;
	String status;

	public Transaction(int id, double amount, String mode, char type, String status) {
		super();
		this.id = id;
		this.amount = amount;
		this.mode = mode;
		this.type = type;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

}
