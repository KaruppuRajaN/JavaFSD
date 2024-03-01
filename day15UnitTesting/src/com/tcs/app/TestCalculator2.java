package com.tcs.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculator2 {

	static Calculator calculator;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("In setUpBeforeClass()");
		calculator=new Calculator();
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("In tearDownAfterClass()");
		calculator=null;
	}
	@Before
	public void setUp() {
		System.out.println("In setUp()");
	}
	@After
	public void tearDown() {
		System.out.println("In tearDown()");
	}
	
	@Test
	public void testAdd() {
		int actual=calculator.add(100,100);
		int expected=200;
		assertEquals(expected, actual);
	}
	@Test
	public void testAdd2() {
		
		int result=calculator.add(100,100);
		boolean expected = true;
		boolean actual = result>0 && result<=20;
		assertTrue(expected==actual);
	}
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//		
//	}

}
