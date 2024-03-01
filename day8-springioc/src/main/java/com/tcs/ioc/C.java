package com.tcs.ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class C {
	A a;
	public C() {
		// TODO Auto-generated constructor stub
	}
	public C(A a) {
		super();
		this.a = a;
	}
	public void other() {
		System.out.println(getClass());
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
