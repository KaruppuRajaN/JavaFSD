package com.tcs.ivstapp;
import java.io.*;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.*;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class TradingSystem  {

	public static void main(String[] args) {
		try {
		boolean option = true;
		HttpClient httpClient = HttpClients.createDefault();
		Scanner sc=new Scanner(System.in);
		while(option) {
			ObjectMapper obm =new ObjectMapper();
			System.out.println("1. Add Investor\n2. Add Transactions\n3. Get All Investors"
					+ "\n4. Get All Transactions\n5. Delete Failed Transactions\n6. Exit");
			System.out.print("Select One Option : ");
			int userInput = sc.nextInt();
			
			switch(userInput){
			case 1:
				System.out.print("First Name: ");
				String fname=sc.nextLine();
				fname=sc.nextLine();
				System.out.print("Last Name: ");
				String lname=sc.nextLine();
				System.out.print("Available Amount: ");
				double amount = sc.nextDouble();
				Investor inv = new Investor(fname,lname,"India",amount);
				String jsonData = obm.writeValueAsString(inv);
				StringEntity sten = new StringEntity(jsonData);
				HttpPost httpPost = new HttpPost("http://localhost:8081/investo/app.1.0/addinvestor");
				httpPost.setEntity(sten);
				httpPost.setHeader("Content-Type","application/json");
				HttpResponse response = httpClient.execute(httpPost);
				System.out.println(EntityUtils.toString(response.getEntity()));
				break;
			case 2:
				String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
				
				System.out.print("Spent Amount: ");
				double spentamount = sc.nextDouble();
				System.out.print("Instrument Type(1. Bond, 2. Share, 3. Others):\t");
				int ttype = sc.nextInt();
				if(ttype<=0 || ttype>=4) {
					System.out.println("Cannot be performed Transactions!!!");
					Transactions trans=new Transactions(timestamp,"Failed-Invalid Instrument Type",ttype,spentamount,0);
					jsonData = obm.writeValueAsString(trans);
					sten = new StringEntity(jsonData);
					httpPost = new HttpPost("http://localhost:8081/investo/app.1.0/addtransaction");
					httpPost.setEntity(sten);
					httpPost.setHeader("Content-Type","application/json");
					response = httpClient.execute(httpPost);
					System.out.println(EntityUtils.toString(response.getEntity()));
				}
				System.out.print("Investor ID: ");
				int iid=sc.nextInt();
				HttpGet httpget = new HttpGet("http://localhost:8081/investo/app.1.0/getinvestor/"+iid);
				
				response = httpClient.execute(httpget);
				Gson gson = new Gson();
				Investor tempInvestor = gson.fromJson(EntityUtils.toString(response.getEntity()), Investor.class);
				if(tempInvestor==null) {
					System.out.println("Kindly Validate Investor ID!!!");
					Transactions trans=new Transactions(timestamp,"Failed-Invalid User ID",ttype,spentamount,iid);
					jsonData = obm.writeValueAsString(trans);
					sten = new StringEntity(jsonData);
					httpPost = new HttpPost("http://localhost:8081/investo/app.1.0/addtransaction");
					httpPost.setEntity(sten);
					httpPost.setHeader("Content-Type","application/json");
					response = httpClient.execute(httpPost);
					System.out.println(EntityUtils.toString(response.getEntity()));
					break;
				}
				else {
					
					Transactions trans=new Transactions(timestamp,"Successful Transaction",ttype,spentamount,iid);
					
					if(spentamount>tempInvestor.getAvailableAmount()) {
						System.out.println("Spent Amount is greater than the Balance. So, you cannot perform the transactions...");
						
						Transactions trans1=new Transactions(timestamp,"Failed-Unavailable Balance",ttype,spentamount,0);
						jsonData = obm.writeValueAsString(trans);
						sten = new StringEntity(jsonData);
						httpPost = new HttpPost("http://localhost:8081/investo/app.1.0/addtransaction");
						httpPost.setEntity(sten);
						httpPost.setHeader("Content-Type","application/json");
						response = httpClient.execute(httpPost);
						System.out.println(EntityUtils.toString(response.getEntity()));
					}
					else {
						jsonData = obm.writeValueAsString(trans);
						sten = new StringEntity(jsonData);
						httpPost = new HttpPost("http://localhost:8081/investo/app.1.0/addtransaction");
						httpPost.setEntity(sten);
						httpPost.setHeader("Content-Type","application/json");
						response = httpClient.execute(httpPost);
						System.out.println(EntityUtils.toString(response.getEntity()));
					tempInvestor.setAvailableAmount(tempInvestor.getAvailableAmount()-spentamount);
					jsonData = obm.writeValueAsString(trans);
					sten = new StringEntity(jsonData);
				HttpPut httpput = new HttpPut("http://localhost:8081/investo/app.1.0/updateinvestor");
					httpput.setEntity(sten);
					httpput.setHeader("Content-Type","application/json");
					response = httpClient.execute(httpput);
					System.out.println(EntityUtils.toString(response.getEntity()));
					}
				}
				System.out.println("Transactions Added Succesfully!!!");
				break;
			case 3:
				httpget = new HttpGet("http://localhost:8081/investo/app.1.0/getallinvestors");
				
				response = httpClient.execute(httpget);
				gson = new Gson();
				Type listType = new TypeToken<List<Investor>>(){}.getType();
				List<Investor> InvestorCache = gson.fromJson(EntityUtils.toString(response.getEntity()),listType);
				
				for(Investor invt : InvestorCache) {
					System.out.println(invt);
				}
				break;
			case 4:
				httpget = new HttpGet("http://localhost:8081/investo/app.1.0/getalltransactions");
				
				response = httpClient.execute(httpget);
				gson = new Gson();
				listType = new TypeToken<List<Transactions>>(){}.getType();
				List<Transactions> TransactionCache = gson.fromJson(EntityUtils.toString(response.getEntity()),listType);
				
				
				for(Transactions tc : TransactionCache) {
					System.out.println(tc);
				}
				break;
			case 5:
				httpget = new HttpGet("http://localhost:8081/investo/app.1.0/getalltransactions");
				
				response = httpClient.execute(httpget);
				gson = new Gson();
				listType = new TypeToken<List<Transactions>>(){}.getType();
				List<Transactions> TransactionCache2 = gson.fromJson(EntityUtils.toString(response.getEntity()),listType);
				
				
				
				for(Transactions tc : TransactionCache2) {
					System.out.println(tc);
					if(tc.getStatus().toLowerCase().contains("failed")) {
						
						HttpDelete httpdelete = new HttpDelete("http://localhost:8081/investo/app.1.0/deletetransaction/"+tc.getTid());
					
					response = httpClient.execute(httpdelete);
					}
				}
				break;
			
			case 6:
				option=false;
				break;

			default:
				System.out.println("Wrong Selection");
				
			}
				
			
			}
			
			}
	catch(Exception e) {}
	}
		
	

}
