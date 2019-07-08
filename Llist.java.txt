
public class Llist {
	static class Node {
		int Data;
		Node Next;

		Node(int Data) {
			this.Data = Data;
			Next = null;
		}
	}

	Node Head;

	public void Print() {
		Node temp = Head;
		while (temp != null) {
			System.out.print(temp.Data + " ");
			temp = temp.Next;
		}
		System.out.println();
	}

	public void InsertEnd(int data) {
		Node End = Head;
		while (End.Next != null) {
			End = End.Next;
		}
		Node Nnod = new Node(data);
		End.Next = Nnod;
	}

	public void InsertBeg(int data) {
		Node New_Node = new Node(data);
		New_Node.Next = Head;
		Head = New_Node;
	}

	public void InsertMiddle(int dat, Node prev) {
		Node New_node = new Node(dat);
		New_node.Next = prev.Next;
		prev.Next = New_node;
	}

	public void Search(int key) {
		Node n = Head;
		while (n != null) {
			if (n.Data == key) {
				System.out.println("Data Found at  " + n.Next);
			}
			n = n.Next;
		}
		System.out.println("Data is Not Present");
	}

	public static void main(String args[]) {
		Llist List = new Llist();
		List.Head = new Node(10);
		System.out.println(List.Head);
		Node Second = new Node(20);
		Node Third = new Node(30);
		Node Fourth = new Node(40);
		List.Head.Next = Second;
		System.out.println(Second);
		Second.Next = Third;
		Third.Next = Fourth;
		List.InsertEnd(50);
		List.Print();
		List.Search(30);

	}
}
