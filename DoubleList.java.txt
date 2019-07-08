
public class DoubleList {
	static class Node {
		int data;
		Node next;
		Node Prev;

		Node(int data) {
			this.data = data;
			next = null;
			Prev = null;
		}
	}

	Node head;

	public void InsertNode(int data) {
		Node Newode = new Node(data);
		Newode.next = head;
		Newode.Prev = null;
		head = Newode;

	}

	public static void main(String args[]) {
		DoubleList List = new DoubleList();
		for (int i = 2; i <= 10; i = i + 2) {
			List.InsertNode(i);
		}
	}
}
