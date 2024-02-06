package com.tcs.oops.inheritance;

public class FundManager {

	public static void main(String[] args) {
		Bond govtBond=new Bond(1,"GovtBond", "FixedRateBond", 100000, "Jan 1,2024", "Jan 1,2025");
		System.out.println(govtBond);
	}

}
