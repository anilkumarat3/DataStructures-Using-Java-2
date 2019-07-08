class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}

	class BinaryTreetraversal {

		Node Root;

		BinaryTreetraversal() {
			Root = null;
		}

		void PostOrder(Node node) {
			if (node == null) {
				System.out.println("No Nodes are Present");
			}
			PostOrder(node.right);
			PostOrder(node.left);
			System.out.println(node.key);
		}

		void PreOrder(Node node) {
			if (node == null) {
				System.out.println("No Nodes are Present");
			}
			System.out.println(node.key);
			PreOrder(node.left);
			PreOrder(node.right);
		}

		void Inorder(Node node) {
			if (node == null) {
				System.out.println("No Nodes are Present");
			}
			Inorder(node.left);
			System.out.println(node.key);
			Inorder(node.right);
		}
	}

	public static void main(String args[]) {
		System.out.println("Inside Main");
		//BinaryTreetraversal t=new BinaryTreetraversal();
	}

}
