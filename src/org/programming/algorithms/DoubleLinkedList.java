package org.programming.algorithms;

public class DoubleLinkedList<D> {
	
	private Node<D> start;
	private Node<D> end;
	private int size;
	
	public DoubleLinkedList() {
		
	}
	
	public void add(D data) {
		Node<D> node = new Node<D>(data);
		
		if (start == null) {
			start = node;
			end = start;
		} else {
			node.setPreviousNode(end);
			end.setNextNode(node);
			end = node;
		}
		size++;
	}
	
	
	public Node<D> getStart() {
		return start;
	}
	
	public void setStart(Node<D> start) {
		this.start = start;
	}
	
	public Node<D> getEnd() {
		return end;
	}
	
	public void setEnd(Node<D> end) {
		this.end = end;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	

}
