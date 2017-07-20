package org.programming.algorithms.tree;

public interface Visitor<K, D> {

	void visit(TreeNode<K, D> treeNode);

}