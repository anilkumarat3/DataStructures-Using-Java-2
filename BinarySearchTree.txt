
public class BinarySearchTree {

	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	Node root;

	BinarySearchTree() {
		root = null;
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);
		return root;

	}

	void inorder() {
		indrderRec(root);
	}

	void indrderRec(Node root) {
		if (root != null) {
			indrderRec(root.right);
			System.out.print(root.key+" ");
			indrderRec(root.left);

		}
	}

	public static void main(String args[]) {
		System.out.println("Inside main");
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(50);
		tree.insert(70);
		tree.insert(90);
		tree.insert(100);
		tree.insert(130);
		tree.insert(104);
		tree.insert(40);
		tree.inorder();

	}
}
