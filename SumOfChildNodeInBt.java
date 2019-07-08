package com.unionbank.datastructure.alg;

public class SumOfChildNodeInBt {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	public static int isSumProperty(Node node) {
		int leftData = 0;
		int rightData = 0;
		if (node == null || (node.left == null && node.right == null))
			return 1;
		else {
			if (node.left != null)
				leftData = node.left.data;
			if (node.right != null)
				rightData = node.right.data;
			if ((node.data == leftData + rightData) && (isSumProperty(node.left) != 0)
					&& (isSumProperty(node.right) != 0))
				return 1;

		}
		return 0;
	}

	public static void main(String[] args) {
		// SumOfChildNodeInBt root=new SumOfChildNodeInBt();
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right.left = new Node(2);
		if (isSumProperty(root) != 0) {
			System.out.println("The Given Tree Satisfy the Children Sum Property");
		} else {
			System.out.println("The Given Tree Not Satisfy the Children Sum Property");
		}

	}

}
