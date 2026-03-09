package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LifecycleDemoTest {
	static Calculator calculator;
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All the test cases");
		calculator = new Calculator();
		return ;
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Before Each Test cases");
	}
	
	@Test
	void testCalculate() {
		assertEquals(12, calculator.calculate(2, 10));
		assertEquals(-1, calculator.calculate(0, -1));
	}
	
	@Test
	void testIsPrime() {
		assertFalse(calculator.isPrime(15));
		assertFalse(calculator.isPrime(1));
		assertTrue(calculator.isPrime(7));
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("executed after each tests.");	
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("executed after all the tests executed");
	}

	
}
