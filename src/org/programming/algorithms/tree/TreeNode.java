package org.programming.algorithms.tree;

public class TreeNode<D,K> {
	private D value;
	private K key;
	private TreeNode<D,K> left;
	private TreeNode<D,K> right;
	public TreeNode(K key2, D data) {
		// TODO Auto-generated constructor stub
	}
	public D getValue() {
		return value;
	}
	public void setValue(D value) {
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public TreeNode<D, K> getLeft() {
		return left;
	}
	public void setLeft(TreeNode<D, K> left) {
		this.left = left;
	}
	public TreeNode<D, K> getRight() {
		return right;
	}
	public void setRight(TreeNode<D, K> right) {
		this.right = right;
	}
}
