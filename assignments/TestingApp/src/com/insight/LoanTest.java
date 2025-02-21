package com.insight;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoanTest {
	Loan l=null;
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
		assertEquals(7,l.sum(3, 4));
	}
}
