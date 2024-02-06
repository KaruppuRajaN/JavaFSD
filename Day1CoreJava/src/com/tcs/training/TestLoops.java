package com.tcs.training;

public class TestLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=0;
		int stop=100;
		while(start<=stop) {
			System.out.println("Start  = "+start);
			start++;
		}
		for(start=0;start<=stop;start++) {
			System.out.println("Start  = "+start);
		}
		stop=0;
		int i=0;
		for(start=100;start>=stop && i<=50;start--,i++) {
			System.out.println("Start  = "+start);
		}
		stop=100;
		for(start=0;start<=stop/2;start++) {
			System.out.println("Start  = "+start);
		}
		for(start=0,stop=100;start<=stop;start=start+2) {
			System.out.println("Start = "+start);
		}
		int count=0;
		for(start=1;start<=stop;start++) {
			count+=start;
			if(start%3==0) {
				System.out.println("Count "+count);
				count=0;
			}
			
		}
		int n=25;
		double p=1000000;
		double ci=1;
		int r=13;
		for(i=1;i<n;i++)
		{
			ci=p*(1+((double)r/100))-p;
			System.out.println("CI Year"+ci);
			p=p+ci;
		}
		System.out.println("CI "+ci);
				
	}

}
