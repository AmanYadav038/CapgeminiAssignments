package com.cg;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
public class CalculatorTest {
	@Test
	public void calTest() {
		Calculator cal = new Calculator();
		assertEquals(12, cal.calculate(9,3));
	}
	
	@Test
	public void isPrimeTest() {
		Calculator cal = new Calculator();
		assertTrue(cal.isPrime(17));
		assertFalse(cal.isPrime(20));
		assertFalse(cal.isPrime(1));
	}
	
}
