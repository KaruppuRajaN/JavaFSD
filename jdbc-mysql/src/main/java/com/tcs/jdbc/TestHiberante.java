package com.tcs.jdbc;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHiberante {

	public static void main(String[] args) {
		Configuration configure = new Configuration();
		configure = configure.configure();
		SessionFactory factory = configure.buildSessionFactory();
		System.out.println(factory);
		
	}

}
