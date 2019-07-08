
public class Middlereplace {
	int count = 0;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	Node head;

	public void InsertNodes(int data) {
		Node New_Node = new Node(data);
		New_Node.next = head;
		head = New_Node;
	}

	public void PrintList() {
		Node n = head;
		count=0;
		while (n != null) {
			count++;
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
		System.out.println("Length of Linked List is--->" + count);
	}

	public void MoveMiddle() {
		// System.out.println("inside");
		int MiddleElement = count / 2;
		Node n = head;
		Node prev = head;
		int k = 1;
		while (n != null) {

			if (k == MiddleElement) {
				System.out.println("Middle Element is-->" + n.data);
				Node Mid = n;
			}
			k++;
			prev = n;
			System.out.println(prev.data);
			n = n.next;
		}
	}

	public void RemoveDuplicates() {
		Node n = head;
		Node prev = null;
		while (n != null) {
			if (n.data == prev.data) {
				prev.next = n.next;
			}
		}
		prev = n;
		n = n.next;
	}
	public void ReverseList(){
		Node Prev=null;
		Node Curr=head;
		Node nex=null;
		while(Curr!=null){
			nex=Curr.next;
			Curr.next=Prev;
			Curr=nex;
		}
		//head=Prev;
	}

	public static void main(String args[]) {
		Middlereplace obj = new Middlereplace();
		obj.InsertNodes(10);
		obj.InsertNodes(10);
		obj.InsertNodes(20);
		obj.InsertNodes(20);
		obj.InsertNodes(30);
		obj.InsertNodes(40);
		obj.InsertNodes(50);
		obj.InsertNodes(60);
		obj.InsertNodes(60);

		obj.PrintList();
		obj.ReverseList();
		obj.PrintList();

	}

}
