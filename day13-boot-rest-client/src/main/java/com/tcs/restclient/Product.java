package com.tcs.restclient;

public class Product {

	private int pid;
	private String description;
	private double amount;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String description, double amount) {
		super();
		this.pid = pid;
		this.description = description;
		this.amount = amount;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", description=" + description + ", amount=" + amount + "]";
	}
	

}
