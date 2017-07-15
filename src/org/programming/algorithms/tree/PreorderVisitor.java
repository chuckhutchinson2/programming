package org.programming.algorithms.tree;

public class PreorderVisitor<K, D> implements Visitor<K, D> {

	private Logic<K, D> logic;

	public PreorderVisitor (Logic<K, D> logic) {
		
		this.logic = logic;
		
	}
	
	@Override
	public void visit(TreeNode<K, D> treeNode) {
		if (treeNode.getLeft() != null) {
			treeNode.getLeft().accept(this);
		}
		
		logic.execute(treeNode);
		
		if (treeNode.getRight() != null) {
			treeNode.getRight().accept(this);
		}
	}

}
