package GFG;

public class DeleteWithoutHead {
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

	public void insert(int data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
			tail = n;
			size++;
		} else {
			tail.next = n;
			tail = n;
			size++;
		}
	}

	public void printAfterDel() {
		deleteNode(head);
	}

	void deleteNode(Node del) {
		if (del == null) {
			return;
		}
		Node temp = del.next;
		del.data = temp.data;
		del.next = temp.next;
		temp = null;
	}

	public void traverse() {
		Node c = head;
		while (c != null) {
			System.err.print(c.data + " ");
			c = c.next;
		}
	}

	public static void main(String[] args) {
		DeleteWithoutHead linked = new DeleteWithoutHead();
		for (int i = 1; i <= 6; i++) {
			linked.insert(i);
		}
		linked.traverse();
		linked.printAfterDel();
		linked.traverse();
	}

}