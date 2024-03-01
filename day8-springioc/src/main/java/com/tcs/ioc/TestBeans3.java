package com.tcs.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeans3 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans3.xml");
//		Object obj = context.getBean("circle");
//		Circle circle=(Circle)obj;
//		circle.calculateArea(3,0,4,0);
		
		
		Object obj = context.getBean("b");
		B b=(B)obj;
		b.other();
		
		Object obj1=(C)context.getBean("c");
		C c=(C)obj1;
		c.other();
		
		boolean result = context.isPrototype("a");
		System.out.println(result);
		context.close();

	}

}
