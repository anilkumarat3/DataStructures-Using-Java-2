
public class SinglyList {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	Node head;

	public void DisplayList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	/*
	 * public void ReverseList() { Node Prev = null; Node Curr = head; Node next
	 * = null; while (Curr != null) { next = Curr.next; Curr.next = Prev; Prev =
	 * Curr; Curr = next; } head = Prev; }
	 */

	public void ReverseList() {
		Node Prev = null;
		Node nex = null;
		Node Curr = head;
		while (Curr != null) {
			nex = Curr.next;
			Curr.next = Prev;
			Prev = Curr;
			Curr = nex;
		}
		head = Prev;
	}

	public static void main(String args[]) {
		SinglyList list = new SinglyList();
		list.head = new Node(10);
		Node Fi = new Node(20);
		Node Se = new Node(30);
		Node th = new Node(40);
		list.head.next = Fi;
		Fi.next = Se;
		Se.next = th;
		list.DisplayList();
		list.ReverseList();
		list.DisplayList();

	}
}
