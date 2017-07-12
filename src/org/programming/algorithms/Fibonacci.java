package org.programming.algorithms;

public class Fibonacci {
	
	static public long fibonacci(long num) {
		
		return num < 2 ? num : fibonacci (num - 1) + fibonacci (num - 2);		
	}

}
