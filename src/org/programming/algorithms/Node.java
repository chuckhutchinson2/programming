package org.programming.algorithms;

public class Node<D> {
	private D data;
	private Node<D> nextNode;
	private Node<D> previousNode;
	
	public Node(D data) {
		this.data = data;
	}

	public D getData() {
		return data;
	}

	public void setData(D data) {
		this.data = data;
	}

	public Node<D> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<D> nextNode) {
		this.nextNode = nextNode;
	}

	public Node<D> getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(Node<D> previousNode) {
		this.previousNode = previousNode;
	}
}
