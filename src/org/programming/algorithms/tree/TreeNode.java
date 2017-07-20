package org.programming.algorithms.tree;

import java.util.Comparator;

public class TreeNode<K,D> {
	private K key;
	private D data;
	private TreeNode<K,D> left;
	private TreeNode<K,D> right;
	
	private TreeNode(K key, D data) {
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

	static <K, D> TreeNode<K, D> create(K key, D data, Comparator<K> comparator) {
		return insert(null, key, data, comparator);
	}
	
	static <D, K> TreeNode<K, D> insert(TreeNode<K, D> tree, K key, D data, Comparator<K> comparator) {
		
		if (tree == null) {
			return new TreeNode<K,D >(key, data);
		}
		
		if (comparator.compare(key, tree.getKey()) < 0) {
			tree.setLeft(insert(tree.getLeft(), key, data, comparator));
		} else {
			tree.setRight(insert(tree.getRight(), key, data, comparator));
		}
		
		return tree;
	}
}
