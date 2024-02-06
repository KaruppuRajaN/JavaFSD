package com.tcs.oops.inheritance;

public class InvestmentInstrument {
	private int iiid;//share,bond,deposit
	private String type;
	private String title;
	private double fund;
	
	public InvestmentInstrument() {
		// TODO Auto-generated constructor stub
	}
	
	public InvestmentInstrument(int iiid, String type, String title, double fund) {
		super();
		this.iiid = iiid;
		this.type = type;
		this.title = title;
		this.fund = fund;
	}

	public int getIiid() {
		return iiid;
	}
	public void setIiid(int iiid) {
		this.iiid = iiid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getFund() {
		return fund;
	}
	public void setFund(double fund) {
		this.fund = fund;
	}
	

}
