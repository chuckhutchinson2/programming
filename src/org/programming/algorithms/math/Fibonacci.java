package org.programming.algorithms.math;

public class Fibonacci {
	
	
	// recursive solution 
	// problem with this solution is the stack/heap the recursion requires for large numbers
	// complexity O(n^2)
	// using this to compute the fibonacci number of 45 is slow in comparison the other two non recursive algorithms below
	static public long fibonacci(long num) {
		
		return num < 2 ? num : fibonacci (num - 1) + fibonacci (num - 2);		
	}
	
	// non recursive solution using a vector to keep track of the previous terms
	// problem is the amount of memory this solution uses
	// time complexity O(n)
	// space complexity O(n)
	static public long fibonacci2(long num) {

		long[] numbers = new long[(int)num+2];
		
		numbers[0] = 0;
		numbers[1] = 1;

		for (int i = 2; i <= num; i++) {
			numbers[i] = numbers[i-1] + numbers[i-2];
		}
		
		return numbers[(int)num];
	}
	
	
	// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 
	// non recursive solution the keeps track of the last two fibonacci numbers and uses them
	// to calculate the next one.
	// complexity O(n)
	// space complexity O(1)
	static public long fibonacci3(long num) {
		if (num < 2) {
			return num;
		}
		long minus1 = 1;
		long minus2 = 0;
		long result = minus1 + minus2;
		for (int i = 2; i <= num; i++) {
			result = minus1 + minus2;
			minus2 = minus1;
			minus1 = result;
		}
		
		return result;
	}

}
