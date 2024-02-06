package com.tcs.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHiberante {

	public static void main(String[] args) {
		Configuration configure = new Configuration();
		configure = configure.configure();
		SessionFactory factory = configure.buildSessionFactory();
		System.out.println(factory);
		Session session = factory.openSession();
		System.out.println(session);
		
		//Insert
		Transaction transaction = session.beginTransaction();
		EmployeeTable emp = new EmployeeTable();
		emp.setEname("Karuppu Raja N");
		emp.setSalary(1500000);
		session.save(emp);
		session.close();
		
		//Fetch
		session = factory.openSession();
		System.out.println(session);
		transaction = session.beginTransaction();
		EmployeeTable emp1 = session.get(EmployeeTable.class, 1);
		System.out.println(emp1);
		
		//Update
		emp1.setSalary(123456);
		session.update(emp1);
		
		//Delete
		session = factory.openSession();
		System.out.println(session);
		transaction = session.beginTransaction();
		EmployeeTable emp2 = session.get(EmployeeTable.class, 4);
		session.delete(emp2);
		
		transaction.commit();
		
	}

}
