package LinkedList;

public class CircularSinglyLinkedList {

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

	public void addNode(int data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
			tail = n;
			tail.next = head;
		} else {
			tail.next = n;
			n.next = head;
			tail = n;
		}
		size++;
	}

	public void print() {
		Node current = head.next;
		if (head == null) {
			System.out.println("LinkedList is empty ");
			return;
		}
		System.out.println("Elements Are ");
		System.out.println(head.data);
		while (current != head) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public int search(int data) {
		if (head == null) {
			// System.out.println("List is empty ");
			return -1;
		}
		if (head.data == data) {
			return 0;
		}
		Node c = head.next;
		int i = 1;
		while (c != head) {
			if (c.data == data)
				return i;
			c = c.next;
			i++;
		}
		return -1;
	}

	/*
	 * addAtHead() addAtTail() addAtIndex()
	 */
	public void addAtHead(int data) {
		Node n = new Node(data);
		if (head == null) {
			head = tail = n;
		} else {
			n.next = head;
			tail.next = n;
			head = n;
		}
		size++;
	}

	public void addAtTail(int data) {
		Node n = new Node(data);
		if (head == null) {
			head = tail = n;
		} else {
			tail.next = n;
			n.next = head;
			tail = n;

		}
		size++;
	}

	public Node getNode(int index) {
		Node p = head;
		for (int i = 0; i < index; i++) {
			p = p.next;
		}
		return p;
	}

	public void addAtIndex(int index, int val) {
		if (index < 0 || index > size) {
			return;
		}
		if (index == 0) {
			addAtHead(val);
		} else if (size == index) {
			addAtTail(val);
		} else {
			Node newNode = new Node(val);
			Node prevNode = getNode(index - 1);
			prevNode.next = newNode;
			newNode.next = prevNode.next.next;
		}
		size++;
	}

	public static void main(String[] args) {

		CircularSinglyLinkedList list = new CircularSinglyLinkedList();
		list.addNode(5);
		list.addNode(8);
		list.addNode(7);
		list.addNode(6);
		list.addNode(6);
		list.addAtHead(4);
		list.addAtTail(10);
		list.addAtIndex(12, 5);
		list.print();
		// System.out.println(list.search(6));
	}
}
