package com.tcs.collections;
import java.util.*;

public class InvestorRepo extends Investor {
	public static boolean findById(ArrayList<Investor> investors,int id) {
		for(Investor i:investors) {
			if(i.getId()==id) {
				return true;
			}
		}
		return false;
	}

}
