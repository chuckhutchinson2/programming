package org.programming.algorithms.math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class CubeTest {

	@Test
	public void test() {
		
		Map<Double, List<Pair>> pairs = new HashMap<Double, List<Pair>>();
		for (int a = 1; a < 100; a++) {
			for (int b = 1; b < 100; b++) {
				Double result = Math.pow(a, 3) + Math.pow(b, 3);
				
				List<Pair> cubes = pairs.get(result);
				
				if (cubes == null) {
					cubes = new ArrayList<Pair>();
				}
				
				cubes.add(new Pair(a, b));
				
				pairs.put(result, cubes);	
			}
		}
		
		for (Double key : pairs.keySet()) {
			System.out.println(key + " " + pairs.get(key));
		}
		
		System.out.println (pairs.size());
	}
}
