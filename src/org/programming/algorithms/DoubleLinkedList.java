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
	
	public int delete(D value) {
		
		int count = deleteImp(value) ? 1 : 0;
		
		while (deleteImp(value)) {
			count++;
		}
		
		return count;
		
	}

	public boolean deleteImp(D value) {

		Node<D> node = start;

		if (value == start.getData()) {
			setStart(start.getNextNode());
			start.setPreviousNode(null);
			setSize(getSize() - 1);

			return true;
		} else {
			Node<D> previousNode = node;

			node = node.getNextNode();

			while (node != null) {
				System.out.println(value + " == " + node.getData());

				if (value == node.getData()) {
					previousNode.setNextNode(node.getNextNode());

					Node<D> nextNode = node.getNextNode();

					if (nextNode != null) {
						nextNode.setPreviousNode(previousNode);
					}

					setSize(getSize() - 1);

					return true;
				}

				previousNode = node;
				node = node.getNextNode();
			}
		}

		return false;
	}
}
