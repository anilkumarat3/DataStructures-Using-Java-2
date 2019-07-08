
public class linkedlist {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	Node Head;

	public void Push(int newdata) {
		Node new_node = new Node(newdata);
		new_node.next = Head;
		Head = new_node;

	}

	public void AddatPert(int NewNode, Node PrevNode) {
		Node New_Node = new Node(NewNode);
		New_Node.next = PrevNode.next;
		PrevNode.next = New_Node;

	}

	public void InsertEnd(int newdata) {
		System.out.println("Indide");
		Node new_node = new Node(newdata);
		Node temp = Head;
		while (temp.next != null) {
			System.out.println("loop");
			temp = temp.next;
		}
		temp.next = new_node;
	}

	public void AddNode(int NewNode) {
		Node New_Node = new Node(NewNode);
		New_Node.next = Head;
		Head = New_Node;
	}

	public void PrintList() {
		Node temp = Head;
		while (temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String args[]) {
		linkedlist list = new linkedlist();
		/*
		 * list.Push(10); list.Push(20); list.Push(30); list.Push(40);
		 * list.Push(50); list.Push(60); list.Push(70); list.Push(80);
		 * list.Push(90); list.Push(100);
		 */
		list.Head = new Node(10);
		Node first = new Node(20);
		Node sec = new Node(30);
		Node th = new Node(40);
		Node fr = new Node(50);
		Node fv = new Node(60);
		Node sx = new Node(70);
		Node svn = new Node(80);
		Node egt = new Node(90);
		Node nn = new Node(202);
		Node ten = new Node(201);
		Node el = new Node(206);
		Node tew = new Node(207);
		Node thi = new Node(205);
		list.Head.next = first;
		first.next = sec;
		sec.next = th;
		th.next = fr;
		fr.next = fv;
		fv.next = sx;
		sx.next = svn;
		svn.next = egt;
		egt.next = nn;
		nn.next = ten;
		ten.next = el;
		el.next = tew;
		tew.next = thi;

		// list.AddNode(500);
		//list.AddatPert(343, ten);
		list.InsertEnd(1000);
		list.PrintList();

	}

}
