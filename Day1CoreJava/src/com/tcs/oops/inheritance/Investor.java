package com.tcs.oops.inheritance;

import java.util.Objects;

public class Investor {
	private int id;
	private String name;
	private String address;
	private double amount;
	static int count=0;
	public int getId() {
		return id;
	}
	public Investor() {
		// TODO Auto-generated constructor stub
	}
	
	public Investor(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Investor(int id, String name, String address, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Investor [id=" + id + ", name=" + name + ", address=" + address + ", amount=" + amount + ", Count="+count+"]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		return id+address.length()+name.length();
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println(this+" - "+obj);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Investor other = (Investor) obj;
		return Objects.equals(address, other.address) && id == other.id && Objects.equals(name, other.name);
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		Investor.count = count;
	}
	
	
}
