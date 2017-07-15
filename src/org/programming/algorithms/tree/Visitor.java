package org.programming.algorithms.tree;

public class Visitor<K, D> {

	public void visit(TreeNode<K, D> treeNode) {
		if (treeNode.getLeft() != null) {
			treeNode.getLeft().accept(this);
		}
		
		System.out.println(treeNode.getKey() + " " + treeNode.getData());
		
		if (treeNode.getRight() != null) {
			treeNode.getRight().accept(this);
		}
	}

}
