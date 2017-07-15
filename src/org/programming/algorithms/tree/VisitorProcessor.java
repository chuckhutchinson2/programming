package org.programming.algorithms.tree;

public interface VisitorProcessor<K, D> {
	
	public void process(TreeNode<K, D> node);

}
