
public class BinaryTree {
	static class Node {
		int key;
		Node left, right;

		Node(int key) {
			this.key = key;
			/*left = null;
			right = null;*/
		}
	}

	static Node root;

	public void InsertNode(Node InsertNode, int data) {
		if (root == null) {
			root = new Node(data);
		}

	}

	public void Inorder(Node root) {
		while (root != null) {
			Inorder(root.left);
			System.out.print(root.key + " ");
			Inorder(root.left);
		}
	}

	public static void main(String args[]) {
		BinaryTree BT = new BinaryTree();
		BT.InsertNode(root, 10);
		BT.InsertNode(root.left, 15);
		BT.InsertNode(root.left.left, 5);
		BT.InsertNode(root.left.right, 12);
		BT.InsertNode(root.right.right, 10);
		BT.Inorder(root);

	}

}
