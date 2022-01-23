package GFG;

public class CountNodeLinkedList {
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

	public int getCount() {
		if (head == null) {
			return 0;
		}
		int count = 0;
		Node c = head;
		while (c != null) {
			count++;
			c = c.next;
		}
		return count;
	}

	int isLengthEvenorOdd() {
		if (head == null) {
			return 0;
		}
		int count = 0;
		Node c = head;
		while (c != null) {
			count++;
			c = c.next;
		}
		if (count % 2 == 0) {
			return 0;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		CountNodeLinkedList linked = new CountNodeLinkedList();
		for (int i = 1; i <= 6; i++) {
			linked.insert(i);
		}
		System.out.println(linked.isLengthEvenorOdd());
		System.out.println(linked.getCount());
	}

}
