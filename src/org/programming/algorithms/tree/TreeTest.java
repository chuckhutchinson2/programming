package org.programming.algorithms.tree;

import org.junit.Test;
import org.programming.algorithms.math.Fibonacci;

public class TreeTest {
	
	
	@Test
	public void testFibonacciTree() {
		TreeNode<Long,Long> tree = null;
		
		for (long i = 0; i < 60; i++) {
			tree = TreeNode.insert (tree, i, Fibonacci.fibonacci3(i), ComparatorUtils.getLongComparator());
		}
		
		printTree2(tree);
	}

	@Test
	public void testAdd() {
		
		TreeNode<Integer,String> tree = TreeNode.create (1, "one", ComparatorUtils.getIntegerComparator());
		
		tree = TreeNode.insert (tree, 2, "two", ComparatorUtils.getIntegerComparator());
		tree = TreeNode.insert (tree, 4, "four", ComparatorUtils.getIntegerComparator());
		tree = TreeNode.insert (tree, 3, "three", ComparatorUtils.getIntegerComparator());
		tree = TreeNode.insert (tree, 6, "six", ComparatorUtils.getIntegerComparator());
		tree = TreeNode.insert (tree, 5, "five", ComparatorUtils.getIntegerComparator());
	
		printTree(tree);
	}

	private void printTree2(TreeNode<Long, Long> tree) {
		Visitor<Long, Long> v = new PreorderVisitor<Long,Long>(new VisitorProcessor<Long, Long>() {
			@Override
			public void process(TreeNode<Long, Long> treeNode) {
				System.out.println(treeNode.getKey() + " " + treeNode.getData());
			}
		});
		
		v.visit(tree);
		
	}
	private void printTree(TreeNode<Integer, String> tree) {
		Visitor<Integer, String> v = new PreorderVisitor<Integer,String>(new VisitorProcessor<Integer, String>() {
			@Override
			public void process(TreeNode<Integer, String> treeNode) {
				System.out.println(treeNode.getKey() + " " + treeNode.getData());
			}
		});
		
		v.visit(tree);
		
	}

}
