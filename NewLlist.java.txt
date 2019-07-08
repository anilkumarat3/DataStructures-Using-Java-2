import java.util.HashSet;

public class NewLlist {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	Node Head;

	public void ListLink(int data) {
		Node newnode = new Node(data);
		newnode.next = Head;
		Head = newnode;

	}

	public void del(int key) {
		System.out.println("inside delete");
		Node temp = Head, prev = null;
		if (temp != null && temp.data == key) {
			Head = temp.next;
		}
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
	}

	public void dell() {
		Head = null;
	}

	public void Print() {
		Node temp = Head;
		while (temp != null) {

			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void Lenth() {
		Node temp = Head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		System.out.println("Length of List is " + count);

	}

	public void find(int index) {
		Node cur = Head;
		int count = 0;
		while (cur != null) {
			if (count == index) {
				System.out.println(cur.data);
			}
			count++;
			cur = cur.next;
		}
	}

	public void Middleelement() {
		Node temp = Head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		System.out.println("length is " + count);
		int n = count / 2;
		System.out.println("Middle Element is  " + n);
		Node nn = Head;
		int k = 0;
		while (nn != null) {

			if (k++ == n) {
				System.out.println("Middle Element is-->" + nn.data);
			}
			// k++;
			nn = nn.next;
		}
	}

	public void CountInt(int value) {
		Node Forref = Head;
		int count = 0;
		while (Forref != null) {
			if (Forref.data == value) {
				count++;
			}
			Forref = Forref.next;
		}
		System.out.println("Number of Times Value " + value + " Present is " + count);
	}

	public void DetectLoop() {
		Node h = Head;
		HashSet<Node> s = new HashSet<Node>();
		while (h != null) {
			if (s.contains(h)) {
				System.out.println("Loop Found");
			}
			s.add(h);
			h = h.next;
		}

	}

	public static void main(String args[]) {
		NewLlist list = new NewLlist();
		list.ListLink(10);
		list.ListLink(20);
		list.ListLink(40);
		list.ListLink(50);
		list.ListLink(20);
		list.ListLink(60);
		list.ListLink(20);
		// list.ListLink(80);
		list.Print();
		list.DetectLoop();
		// list.Print();

	}

}
