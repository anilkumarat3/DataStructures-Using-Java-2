class Node3 {
	int key;
	Node3 left;
	Node3 right;

	Node3(int key) {
		this.key = key;
		left = right = null;
	}

}

public class LevelOrderTraversal {
	public static void inorder(Node3 root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.key + " ");
			inorder(root.right);
		}
	}

	public static void main(String args[]) {
		Node3 root = new Node3(10);
		root.left = new Node3(20);
		root.right = new Node3(30);
		root.left.left = new Node3(40);
		root.left.right = new Node3(50);
		root.right.left = new Node3(60);
		root.right.right = new Node3(70);
		root.right.right.right = new Node3(80);
		inorder(root);
		System.out.println();

	}
}
