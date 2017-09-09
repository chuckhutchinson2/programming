package org.programming.algorithms.sorting;

public class Sort {
	
	
	public static int[] bubbleSort (int[] values) {
		
		for (int i = 0; i < values.length; i++) {
			for (int j = i; j < values.length; j++) {
				if (values[j] < values[i]) {
					int temp = values[i];
					values[i] = values[j];
					values[j] = temp;
				}
			}
		}
		
		return values;
	}

}
