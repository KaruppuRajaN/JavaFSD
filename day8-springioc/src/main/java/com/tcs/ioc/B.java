package com.tcs.ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;

public class B {
	A a;
	@Qualifier("a1")
	public void setA(A a) {
		this.a=a;
	}
	public void other() {
		a.method();
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
