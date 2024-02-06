package com.tcs.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate2 {
public static void main(String[] args) {
	Configuration configure = new Configuration();
	configure = configure.configure();
	SessionFactory sess = configure.buildSessionFactory();
	Session s = sess.openSession();
	Transaction t=s.beginTransaction();
	
	Investor inv =new Investor();
	inv.setAddress("Madurai");
	inv.setAmount(20000);
	inv.setName("Karuppu Raja N");
	inv.setInstrument("Bond");
	s.save(inv);
	
	Investor inv1 = s.get(Investor.class,1);
	System.out.println(inv1);
	
	inv1.setAmount(1234);
	s.update(inv1);
	
//	Investor inv2 = s.get(Investor.class,2);
//	s.delete(inv2);
	t.commit();
	
	Query<Investor> query = s.createQuery("from Investor e");
	List<Investor> list = query.list();
	for(Investor it:list) {
		System.out.println(it);
	}
	
}
}
