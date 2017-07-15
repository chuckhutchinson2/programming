package org.programming.algorithms.math;

public class Fibonacci {
	
	
	// recursive solution 
	// problem with this solution is the stack/heap the recursion requires for large numbers
	static public long fibonacci(long num) {
		
		return num < 2 ? num : fibonacci (num - 1) + fibonacci (num - 2);		
	}
	
	// non recursive solution using a vector to keep track of the previous terms
	// problem is the amount of memory this solution uses
	static public long fibonacci2(long num) {

		long[] numbers = new long[(int)num+2];
		
		numbers[0] = 0;
		numbers[1] = 1;

		for (int i = 2; i <= num; i++) {
			numbers[i] = numbers[i-1] + numbers[i-2];
		}
		
		return numbers[(int)num];
	}

}
