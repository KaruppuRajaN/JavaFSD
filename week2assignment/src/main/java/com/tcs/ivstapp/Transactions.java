package com.tcs.ivstapp;

import javax.persistence.*;
import javax.persistence.GenerationType;

@Entity
public class Transactions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	private String timestamp;
	private String status;
	private String spentType;
	private double spentAmount;
	private int invID;
	private enum instrumentType{
		bond,share,others
	}
	public Transactions() {
		// TODO Auto-generated constructor stub
	}
	
	public Transactions(String timestamp, String status, String spentType, double spentAmount, int invID) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.spentType = spentType;
		this.spentAmount = spentAmount;
		this.invID = invID;
	}
	
	public String getStatus() {
		return status;
	}

	public void setSpentType(String spentType) {
		this.spentType = spentType;
	}

	public Transactions(String timestamp, String status, int spentType, double spentAmount, int invID) {
		super();
		this.tid = tid;
		this.timestamp = timestamp;
		this.status = status;
		if(spentType==1)
			this.spentType = instrumentType.bond.toString();
		else if(spentType==2)
			this.spentType = instrumentType.share.toString();
		else
			this.spentType = instrumentType.others.toString();
		this.spentAmount = spentAmount;
		this.invID = invID;
	}


	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String isStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSpentType() {
		return spentType;
	}
	public double getSpentAmount() {
		return spentAmount;
	}
	public void setSpentAmount(double spentAmount) {
		this.spentAmount = spentAmount;
	}

	@Override
	public String toString() {
		return "Transactions [tid=" + tid + ", timestamp=" + timestamp + ", status=" + status + ", spentType="
				+ spentType + ", spentAmount=" + spentAmount + ", invID=" + invID + "]";
	}

	public int getInvID() {
		return invID;
	}

	public void setInvID(int invID) {
		this.invID = invID;
	}
	
	

}
