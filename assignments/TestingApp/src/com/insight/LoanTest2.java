package com.insight;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoanTest2 {

	Loan l;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("before each");
		l=new Loan();
		assertEquals(l.getEmi(60000),5000);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after each");
	}

	@Test
	void testGetEmi() {
		l=new Loan();
		assertEquals(5000,l.getEmi(60000));
		System.out.println("Entered test case");
//		fail("Not yet implemented");
	}
	@Test
	void testSum() {
		l=new Loan();
		System.out.println("Entered test case2");

		assertEquals(7,l.sum(3, 4));
	}
	@Test 
	public void testDivide() {
		ArithmeticException exception=assertThrows(ArithmeticException.class,()->{
			l.divide(10,2);
		});
		assertEquals("/ by zero",exception.getMessage());
	}
	public void testDeposit() {
		MyException e=assertThrows(MyException.class,()->{
			l.deposit();
		});
		assertEquals("sample exception",e.getMessage());
	}
}
