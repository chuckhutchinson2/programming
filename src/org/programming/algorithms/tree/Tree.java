package org.programming.algorithms.tree;

public class Tree<K, D> {
	private TreeNode<K,D> root;
	
	
	public void add(K key, D data) {
		
		if (root == null) {
			root = new TreeNode<K,D>(key,data);
		}
	}

}
