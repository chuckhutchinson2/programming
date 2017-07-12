package org.programming.algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoubleLinkedListTest {

	@Test
	public void test() {
		DoubleLinkedList<String> list = new DoubleLinkedList<String>();
		
		
		list.add("a");
		
		assertEquals(1, list.getSize());
		
		list.add("ab");
		
		assertEquals(2, list.getSize());
		
		
		for (Node<String> node)
	}

}
