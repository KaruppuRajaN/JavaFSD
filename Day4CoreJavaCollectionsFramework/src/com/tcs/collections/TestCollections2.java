package com.tcs.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class TestCollections2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Investor i1=new Investor(1,"abc","madurai","shares",50001);
		Investor i2=new Investor(2,"cba","chennai","bonds",50000);
		Investor i3=new Investor(3,"bca","namakkal","deposits",10000);
		Investor i4=new Investor(4,"cbadd","theni","shares",30000);
		Investor i5=new Investor(5,"klacba","sivaganga","bonds",102090);
		Investor i6=new Investor(5,"klacba","sivaganga","bonds",102090);
		Investor i7=i6;
		
		TreeSet<Investor> set=new TreeSet<>();
		set.add(i1);
		set.add(i2);
		set.add(i3);
		set.add(i4);
		set.add(i5);
		set.add(i6);
		set.add(i7);
		
		System.out.println(set.size());
		ArrayList<Investor> al=new ArrayList<>(set);
		System.out.println(al);
		
		
	}

}
