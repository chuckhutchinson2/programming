package org.programming.algorithms.math;

public class Pair {
	long a;
	long b;
	
	public Pair (long a, long b) {
		this.a = a;
		this.b = b;
	}
	
	public long getA() {
		return a;
	}
	public void setA(long a) {
		this.a = a;
	}
	public long getB() {
		return b;
	}
	public void setB(long b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "(" + a + ", " + b + ")";
	}
}
