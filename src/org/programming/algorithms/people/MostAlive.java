package org.programming.algorithms.people;

import org.junit.Test;

public class MostAlive {
	
	int getMinBirthYear(Person[] people) {

		int minYear = 9999;
		
		for (int i = 0; i < people.length; i++) {
			if (people[i].getBirthYear() < minYear) {
				minYear = people[i].getBirthYear();
			}
		}
		
		return minYear;
	}

	int getMaxDeathYear(Person[] people) {

		int maxYear = 0;
		
		for (int i = 0; i < people.length; i++) {
			if (people[i].getDeathYear() > maxYear) {
				maxYear = people[i].getDeathYear();
			}
		}
		
		return maxYear;
	}

	@Test
	public void test() {
		Person[] people = new Person[] {
				new Person(1975, 2001),
				new Person(1948, 1988),
				new Person(1750, 1799),
				new Person(1978, 2030),
				new Person(2005, 2089),
				new Person(1932, 1964),
				new Person(1964, 2176),
				new Person(1492, 1515),
				new Person(1975, 2001),
				new Person(1892, 1945),
				new Person(1945, 1999),
				new Person(1975, 2001)
		};
		
		int maxYear = getMaxDeathYear(people);
		int minYear = getMinBirthYear(people);
		
		int[] populationCountByYears = new int[maxYear - minYear + 1];
		
		for (int i = 0; i < people.length; i++) {
			for (int j = people[i].getBirthYear(); j < people[i].getDeathYear(); j++) {
				populationCountByYears[j - minYear]++;
			}
		}
		
		int peakYear = -1;
		int maxCount = -1;
		
		for (int i = 0; i < populationCountByYears.length; i++) {
			if (populationCountByYears[i] > maxCount) {
				maxCount = populationCountByYears[i];
				peakYear = i;
			}
			
			System.out.println( (i + minYear) + " = " + populationCountByYears[i]);
		}
		
		System.out.println( (peakYear + minYear) + " = " + maxCount);
		
	}

}
