package com.tcs.ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;




public class A {
	public void method() {
		System.out.println("From A");
	}
	
	@PostConstruct
	public void myInit() {
		System.out.println(getClass()+" Init()");
	}
	
	@PreDestroy
	public void myDestory() {
		System.out.println(getClass()+" Destory()");
	}

}
