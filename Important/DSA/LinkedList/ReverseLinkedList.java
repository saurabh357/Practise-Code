

public class ReverseLinkedList {

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;
	Node tail = null;
	static int size = 0;

	public void add(int data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			tail = n;
		}
		size++;
	}
	// Recursively

	public Node Reverse(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node newNode = Reverse(head.next);
		Node headnext = head.next;
		headnext.next = head;
		head.next = null;
		return headnext;
	}

	// Iteratively
	public Node reverse(Node head) {
		Node prev = null;
		Node temp = null;
		Node curr = head;
		while (curr != null) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}

	public void print() {
		Node current = head;
		if (head == null) {
			System.out.println("List is empty ");
			return;
		}
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
//		System.out.println(size);
		list.reverse(null);
		list.print();
	}

}
