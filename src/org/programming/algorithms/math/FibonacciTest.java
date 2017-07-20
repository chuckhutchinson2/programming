package org.programming.algorithms.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void testOne() {
		assertEquals(1, Fibonacci.fibonacci(1));
		assertEquals(1, Fibonacci.fibonacci2(1));
		assertEquals(1, Fibonacci.fibonacci3(1));
	}
	
	@Test
	public void testTwo() {
		assertEquals(1, Fibonacci.fibonacci(2));
		assertEquals(1, Fibonacci.fibonacci2(2));
		assertEquals(1, Fibonacci.fibonacci3(2));
	}
	
	@Test
	public void testThree() {
		assertEquals(2, Fibonacci.fibonacci(3));
		assertEquals(2, Fibonacci.fibonacci2(3));
		assertEquals(2, Fibonacci.fibonacci3(3));		
	}
	
	
	@Test
	public void testFour() {
		assertEquals(3, Fibonacci.fibonacci(4));
		assertEquals(3, Fibonacci.fibonacci2(4));	
		assertEquals(3, Fibonacci.fibonacci3(4));		
	}
	
	@Test
	public void testFive() {
		assertEquals(5, Fibonacci.fibonacci(5));
		assertEquals(5, Fibonacci.fibonacci2(5));		
		assertEquals(5, Fibonacci.fibonacci3(5));		
	}
	
	@Test
	public void testSix() {
		assertEquals(8, Fibonacci.fibonacci(6));
		assertEquals(8, Fibonacci.fibonacci2(6));		
		assertEquals(8, Fibonacci.fibonacci3(6));		
	}
	
	@Test
	public void testPrint() {
		
		for (int i = 0; i < 15; i++ ) {

			System.out.print("Fibonacci(" + i + ") = ");
			System.out.print(Fibonacci.fibonacci2(i) + " ");
			System.out.print(Fibonacci.fibonacci3(i) + " ");
			System.out.println(Fibonacci.fibonacci(i) + " ");
			
			assertEquals(Fibonacci.fibonacci2(i), Fibonacci.fibonacci3(i));
			
			assertEquals(Fibonacci.fibonacci(i), Fibonacci.fibonacci2(i));

		}
		
		System.out.println();
	}
}
