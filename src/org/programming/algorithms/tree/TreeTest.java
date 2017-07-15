package org.programming.algorithms.tree;

import static org.junit.Assert.*;

import org.junit.Test;

public class TreeTest {

	@Test
	public void testAdd() {
		TreeNode<Integer,String> tree = insert (1, "one");
		
		tree = insert (tree, 2, "two");
		tree = insert (tree, 4, "four");
		tree = insert (tree, 3, "three");
		tree = insert (tree, 6, "six");
		tree = insert (tree, 5, "five");
	
		printTree(tree);
	}

	
	/*
    if (value < node.value)
    {
        if (node.left != null)
        {
            insert(node.left, value);
        } 
        else
        {     
            node.left = new Node(value);
        }
    } 
    else if (value > node.value)
    {
        if (node.right != null)
        {
            insert(node.right, value);
        }
        else
        {
            node.right = new Node(value);
        }
    }
*/
	
	TreeNode<Integer, String> insert(Integer key, String data) {
		return insert(null, key, data);
	}
	
	TreeNode<Integer, String> insert(TreeNode<Integer, String> tree, Integer key, String data) {
		
		if (tree == null) {
			return new TreeNode<Integer,String>(key, data);
		}
		
		if (key <= tree.getKey()) {
			tree.setLeft(insert(tree.getLeft(), key, data));
		} else {
			tree.setRight(insert(tree.getRight(), key, data));
		}
		
		return tree;
	}

	private void printTree(TreeNode<Integer, String> tree) {
		Visitor<Integer, String> v = new PreorderVisitor<Integer,String>();
		
		v.visit(tree);
		
	}

}
