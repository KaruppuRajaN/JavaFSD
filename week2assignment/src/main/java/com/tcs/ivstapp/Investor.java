package com.tcs.ivstapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="InvestorA")
public class Investor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstname;
	private String lastname;
	private String state;
	private double availableAmount;
	public Investor() {
		// TODO Auto-generated constructor stub
	}
	public Investor(String firstname, String lastname, String state, double availableAmount) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.state = state;
		this.availableAmount = availableAmount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getAvailableAmount() {
		return availableAmount;
	}
	public void setAvailableAmount(double availableAmount) {
		this.availableAmount = availableAmount;
	}
	@Override
	public String toString() {
		return "Investor [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", state=" + state
				+ ", availableAmount=" + availableAmount + "]";
	}
	

}
