package com.tcs.collections;
import java.util.*;
import java.util.Map.Entry;
public class TestCollections3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Investor> hm = new HashMap<>();
		Investor i1=new Investor(1,"abc","madurai","shares",50001);
		Investor i2=new Investor(2,"cba","chennai","bonds",50000);
		Investor i3=new Investor(3,"bca","namakkal","deposits",10000);
		Investor i4=new Investor(4,"cbadd","theni","shares",30000);
		Investor i5=new Investor(5,"klacba","sivaganga","bonds",102090);
		Investor i6=new Investor(5,"klacba","sivaganga","bonds",102090);
		Investor i7=i6;
		hm.put(1, i1);
		hm.put(2, i2);
		hm.put(3, i3);
		hm.put(4, i4);
		hm.put(5, i5);
		hm.put(6, i6);
		hm.put(7, i7);
		i7=null;
		hm.put(null, i7);
		
		System.out.println(hm);
		for(Integer t:hm.keySet()) {
			System.out.println(t+" - "+hm.get(t));
		}
		
		System.out.println(hm.values());
		
		Set<Entry<Integer,Investor>> kv  = hm.entrySet();
		System.out.println(kv);
		
		Iterator<Entry<Integer,Investor>> iv1 = kv.iterator();
		while(iv1.hasNext()) {
			Entry<Integer,Investor> etr = iv1.next();
			System.out.println(etr.getKey() + " ----> "+etr.getValue());
		}
		
	}

}
