package org.programming.algorithms.tree;

import java.util.Comparator;

public class ComparatorUtils {

	static Comparator<Long> getLongComparator() {
		return new Comparator<Long>() {
			@Override
			public int compare(Long o1, Long o2) {
				return (int) (o1 - o2);
			}
		};
	}
	static Comparator<Integer> getIntegerComparator() {
		return new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		};
	}
}
