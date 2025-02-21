package com.insight;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArithTest {

	@Test
	void test() {
		Arith a=new Arith();
		assertEquals(10,a.add(6,4));
	}

}
