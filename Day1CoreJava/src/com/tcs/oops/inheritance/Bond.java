package com.tcs.oops.inheritance;

public class Bond extends InvestmentInstrument{
	private String startDate;
	private String repayDate;
	public Bond() {
		// TODO Auto-generated constructor stub
	}
	public Bond(int iiid, String type, String title, double fund,String startDate, String repayDate) {
		super(iiid, type, title, fund);
		this.startDate=startDate;
		this.repayDate=repayDate;
		
		
	}
	@Override
	public String toString() {
		return "Bond [startDate=" + startDate + ", repayDate=" + repayDate + ", getIiid()=" + getIiid() + ", getType()="
				+ getType() + ", getTitle()=" + getTitle() + ", getFund()=" + getFund() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
