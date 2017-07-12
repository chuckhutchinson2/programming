package org.programming.algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void testOne() {
		assertEquals(1, Fibonacci.fibonacci(1));
	}
	
	@Test
	public void testTwo() {
		assertEquals(1, Fibonacci.fibonacci(2));
	}
	
	@Test
	public void testThree() {
		assertEquals(2, Fibonacci.fibonacci(3));
	}
	
	
	@Test
	public void testFour() {
		assertEquals(3, Fibonacci.fibonacci(4));
	}
	
	@Test
	public void testFive() {
		assertEquals(5, Fibonacci.fibonacci(5));
	}
	
	@Test
	public void testSix() {
		assertEquals(8, Fibonacci.fibonacci(6));
	}
	
	@Test
	public void testPrint() {
		
		for (int i = 0; i < 15; i++ ) {
			System.out.print(Fibonacci.fibonacci(i) + " ");
		}
		
		System.out.println();
	}
}
