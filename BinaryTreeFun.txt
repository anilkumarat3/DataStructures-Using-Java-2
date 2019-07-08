class Node1 {
	int key;
	Node1 left;
	Node1 right;

	Node1(int key) {
		this.key = key;
		left = right = null;

	}
}

public class BinaryTreeFun {
	public static void Inorder(Node1 root) {
		//System.out.println("Inorder:");
        //System.out.println(root);
		if (root != null) {
			Inorder(root.left);
			System.out.print(root.key + " ");
			Inorder(root.right);
		}
		//System.out.println();
	}

	public static void Preorder(Node1 root) {
		//System.out.println("Preorder:");

		if (root != null) {
			System.out.print(root.key + " ");
			Preorder(root.left);
			Preorder(root.right);
		}
		//System.out.println();
	}

	public static void PostOrder(Node1 root) {
		System.out.println("PostOrder:");
		if (root != null) {
			PostOrder(root.left);
			PostOrder(root.right);
			System.out.print(root.key + " ");
		}
		//System.out.println();
	}

	public static void main(String args[]) {
		Node1 root = new Node1(10);
		root.left = new Node1(15);
		root.left.left = new Node1(5);
		root.left.right = new Node1(4);
		root.right = new Node1(12);
		root.right.right = new Node1(8);
		//PostOrder(root);
		System.out.println();
		//Preorder(root);
	//	System.out.println();
		Inorder(root);

	}
}
