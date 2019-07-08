
public class DoublyLinkedList {
	static class Node {
		int data;
		Node prev;
		Node next;

		Node(int data) {
			this.data = data;
			// prev = null;
			// next = null;
		}
	}

	Node head;

	public void insert(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		new_node.prev = null;
	//	System.out.println(head);
		if (head != null) {
			head.prev = new_node;
		}
		head = new_node;
	}

	public void InseratMiddle(int PrevData, int InsertData) {
		Node new_node = new Node(InsertData);
		Node N = head;
		while (N != null) {
			if (N.data == PrevData) {
				Node Prev = N;
				new_node.next = Prev.next;
				Prev.next = new_node;
				new_node.prev = Prev;
				// new_node.prev=N;
				if (new_node.next != null) {
					new_node.next.prev = new_node;
				}
			}
			N = N.next;
		}

	}

	public void DeleteNode(int Datadel) {
		int n = 0;
		Node temp = head;
		Node pre = null;
		while (temp != null) {
			if (temp.data == Datadel) {
				pre.next = temp.next;
				pre.next.prev = pre;
				break;

			}
			pre = temp;
			temp = temp.next;
		}

	}

	public void reverse() {
		Node temp = null;
		Node curr = head;
		while (curr != null) {
			temp = curr.prev;
			curr.prev = curr.next;
			curr.next = temp;
			curr = curr.prev;
		}
		if (temp != null) {
			head = temp.prev;
		}
		System.out.println("Reverse List is:");
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}

	public void Printlist(Node node) {
		Node last = null;
		System.out.println("Traversal in Forward Direction");
		while (node != null) {
			System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}
		System.out.println();
		/*
		 * System.out.println("Traversal in Reverse Direction"); while (last !=
		 * null) { System.out.print(last.data + " "); last = last.prev; }
		 * System.out.println();
		 */
	}

	public static void main(String args[]) {
		DoublyLinkedList ab = new DoublyLinkedList();
		// System.out.println(ab.head.data+" "+ab.head.next+" "+ab.head.prev);
		ab.insert(10);
		ab.insert(20);
		ab.insert(30);
		ab.insert(40);
		ab.insert(50);
		ab.Printlist(ab.head);

		ab.reverse();
		// ab.DeleteNode(30);
		ab.Printlist(ab.head);

	}

}
