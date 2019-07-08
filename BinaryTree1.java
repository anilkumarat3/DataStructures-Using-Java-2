package com.unionbank.datastructure.alg;

import java.util.*;

public class BinaryTree {
	static class Node {
		int key;
		Node left;
		Node right;

		Node(int key) {
			this.key = key;
			left = null;
			right = null;
		}
	}

	static int sum = 0;

	public static void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.key + " ");
			inOrder(root.right);
		}
		// System.out.println();
	}

	// Node root;
	public static int addbt(Node root) {
		if (root == null)
			return 0;
		return (root.key + addbt(root.left) + addbt(root.right));

	}

	public static int SumofParentNode(Node root, int x) {

		if (root == null)
			return 0;
		if ((root.left != null && root.left.key == x) || (root.right != null && root.key == x)) {
			sum += root.key;
		}
		SumofParentNode(root.left, x);
		SumofParentNode(root.right, x);
		return sum;

	}

	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(60);
		root.left.right = new Node(80);
		root.left.left.left = new Node(50);
		root.right = new Node(50);
		root.right.left = new Node(70);
		root.right.right = new Node(100);
		root.right.left.left = new Node(70);
		root.right.left.right = new Node(60);
		root.right.right.left = new Node(10);
		System.out.println("Inorder Traversal of Binary Tree is:  ");
		inOrder(root);
		// int sum = addbt(root);
		System.out.println();
		// System.out.println("Sum of Elements in Binary Tree is: " + sum);
		System.out.println("Sum of Parent Node with x is:");
		int val = SumofParentNode(root, 70);
		System.out.println(val);
	}

}
