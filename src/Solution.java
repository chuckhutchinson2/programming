import java.io.*;
import java.util.*;

/*
* To execute Java, please define "static void main" on a class
* named Solution.
*
* If you need more classes, simply define them inline.
*/

class Solution {

	static int fib(int value) {
		return value < 2 ? value : fib(value - 1) + fib(value - 2);
	}

	static int fib2(int value) {

		int[] values = new int[value + 2];
		values[0] = 0;
		values[1] = 1;

		return fib2imp(value, values);
	}

	static int fib2imp(int value, int[] values) {

		if (value == 0) {
			return value;
		}

		if (values[value] != 0) {
			return values[value];
		}

		values[value] = fib2imp(value - 1, values) + fib2imp(value - 2, values);

		return values[value];
	}

	static int fib3(int value) {
		int[] values = new int[value + 2];

		values[0] = 0;
		values[1] = 1;

		for (int i = 2; i <= value; i++) {
			values[i] = values[i - 1] + values[i - 2];
		}

		return values[value];
	}

	static int fib4(int value) {
		if (value < 2) {
			return value;
		}

		int n1 = 1;
		int n2 = 0;
		int result = 0;

		for (int i = 2; i <= value; i++) {
			result = n1 + n2;
			n2 = n1;
			n1 = result;
		}

		return result;
	}

	static class Node {
		Node right;
		Node left;
		int value;

		public Node(int value) {
			this.value = value;
		}

		public Node insert(int value) {
			return insert(this, value);
		}

		void print() {
			print(this);
		}

		static void print(Node n) {

			if (n.left != null) {
				print(n.left);
			}

			System.out.println(n.value);

			if (n.right != null) {
				print(n.right);
			}

		}

		static Node insert(Node node, int value) {

			if (node == null) {
				return new Node(value);
			}

			// System.out.println (value + " " + node.value);
			if (value < node.value) {
				node.left = insert(node.left, value);
			} else {
				node.right = insert(node.right, value);
			}

			return node;
		}
	}

	public void print(int[] values) {
		System.out.println("---------");
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

	}

	public int[] sort(int[] values) {

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

	public static void main(String[] args) {

		Solution s = new Solution();

		s.print(s.sort(new int[] { 5, 4, 3, 2, 1 }));
		s.print(s.sort(new int[] { 1, 2, 3, 4, 5 }));
		s.print(s.sort(new int[] { 2, 3, 4, 5, 1 }));
		s.print(s.sort(new int[] { 5, 1, 4, 2, 3 }));

		Node root = new Node(3);
		root.insert(2);
		root.insert(1);
		root.insert(4);
		root.insert(5);

		System.out.println("tree ------");

		root.print();

		System.out.println("fib ------");

		for (int i = 0; i < 12; i++) {
			System.out.print(i + " " + fib(i));
			System.out.print(" " + fib2(i));
			System.out.print(" " + fib3(i));
			System.out.print(" " + fib4(i));
			System.out.println();

		}

	}
}
