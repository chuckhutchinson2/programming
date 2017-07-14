package org.programming.algorithms.tree;

public class Tree<D, K> {
	private TreeNode<D,K> root;
	
	
	public void add(K key, D data) {
		
		if (root == null) {
			root = new TreeNode<D,K>(key,data);
		}
	}

}
