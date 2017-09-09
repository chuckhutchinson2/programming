package org.programming.algorithms.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortTest {

	@Test
	public void test() {
		int[] numbers = { 5, 4, 3, 2, 1};
		
		int[] result = Sort.bubbleSort(numbers);
		
		print (result);
	}
	
	@Test
	public void test2() {
		int[] numbers = { 1, 2, 3, 4, 5};
		
		int[] result = Sort.bubbleSort(numbers);
		
		print (result);
	}
	
	@Test
	public void test3() {
		int[] numbers = { 5, 2, 1, 4, 3};
		
		int[] result = Sort.bubbleSort(numbers);
		
		print (result);
	}
	private void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}

}
