package org.programming.algorithms.tree;

public class TreeNode<K,D> {
	private K key;
	private D data;
	private TreeNode<K,D> left;
	private TreeNode<K,D> right;
	public TreeNode(K key, D data) {
		this.key = key;
		this.data = data;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public D getData() {
		return data;
	}
	public void setData(D data) {
		this.data = data;
	}
	public TreeNode<K, D> getLeft() {
		return left;
	}
	public void setLeft(TreeNode<K, D> left) {
		this.left = left;
	}
	public TreeNode<K, D> getRight() {
		return right;
	}
	public void setRight(TreeNode<K, D> right) {
		this.right = right;
	}
	
	public void accept(Visitor<K, D> v) {
		v.visit(this);
	}

}
