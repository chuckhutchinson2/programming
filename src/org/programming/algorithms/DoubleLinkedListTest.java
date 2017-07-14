package org.programming.algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoubleLinkedListTest {

	@Test
	public void testAdd() {
		DoubleLinkedList<String> list = new DoubleLinkedList<String>();
		
		list.add("a");
		
		assertEquals(1, list.getSize());
		
		list.add("ab");
		
		assertEquals(2, list.getSize());

		list.add("abc");
		
		assertEquals(3, list.getSize());

		printList(list.getStart());
		printReverseList(list.getEnd());
	}

	@Test
	public void testDeleteBeginningOfList() {
		DoubleLinkedList<String> list = new DoubleLinkedList<String>();
		
		list.add("a");
		
		assertEquals(1, list.getSize());
		
		list.add("ab");
		
		assertEquals(2, list.getSize());

		assertEquals(1, list.delete("a"));
		
		assertEquals(1, list.getSize());

		printList(list.getStart());
	}
	
	@Test
	public void testDeleteEndOfList() {
		DoubleLinkedList<String> list = new DoubleLinkedList<String>();
		
		list.add("a");
		list.add("ab");
		
		assertEquals(2, list.getSize());

		assertEquals(1, list.delete("ab"));
		
		assertEquals(1, list.getSize());

		printList(list.getStart());
	}

	@Test
	public void testDeleteInList() {
		DoubleLinkedList<String> list = new DoubleLinkedList<String>();
		
		list.add("a");
		list.add("ab");
		list.add("abc");
		
		assertEquals(3, list.getSize());

		assertEquals(1, list.delete("ab"));
		assertEquals(2, list.getSize());

		printList(list.getStart());
	}

	@Test
	public void testDeleteDuplicatesInList() {
		DoubleLinkedList<String> list = new DoubleLinkedList<String>();
		
		list.add("ab");
		list.add("a");
		list.add("ab");
		
		list.add("abc");
		list.add("ab");
		
		assertEquals(5, list.getSize());
		printList(list.getStart());

		assertEquals(3, list.delete("ab"));
		assertEquals(2, list.getSize());

		printList(list.getStart());
	}

	private void printList(Node<String> node) {
		System.out.println("----------------");
		while(node != null) {
			System.out.println(node.getData());
			node = node.getNextNode();
		}
	}

	private void printReverseList(Node<String> node) {
		System.out.println("----------------");
		while(node != null) {
			System.out.println(node.getData());
			node = node.getPreviousNode();
		}
	}
}
