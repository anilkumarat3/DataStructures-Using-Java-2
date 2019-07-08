
public class Cirlist {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	static Node head;

	public void Push(Node head, int Data) {
		Node newnode = new Node(Data);
		Node temp = head;
		newnode.next = head;
		if (head != null) {
			while (temp.next != head) {
				temp = temp.next;
				temp.next = newnode;
			}
		} else {
			newnode.next = newnode;
		}
		head = newnode;
	}

	public void PrintList(Node head) {
		Node temp = null;
		if (head != null) {
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;

			} while (temp != head);
		}
	}

	public static void main(String args[]) {
		Cirlist CL = new Cirlist();
		CL.Push(head, 10);
		CL.Push(head, 20);
		CL.Push(head, 30);
		CL.Push(head, 40);
		CL.Push(head, 50);
		CL.Push(head, 60);
		CL.Push(head, 70);
		CL.Push(head, 80);
		CL.PrintList(head);
		
	}

}
