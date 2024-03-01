package com.tcs.ioc;
import org.springframework.context.support.*;
public class TestBeans2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
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
