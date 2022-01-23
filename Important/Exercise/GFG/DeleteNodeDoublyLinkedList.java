package GFG;

public class DeleteNodeDoublyLinkedList {

	class Node {
		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
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
			n.prev = tail;
			tail.next = n;
			tail = n;
			size++;
		}
	}
//	public void deleteAt(int x) {
//		if (x < 0) {
//			return;
//		}
//		if (x == 0) {
//			head = head.next;
//			head.prev = null;
//		} else {
//			Node pr = getNode(x-1);
//			pr.next = pr.next.next;
//			if (pr.next.next != null) {
//				pr.next.next.prev = pr;
//			}
//			if (size == x) {
//				tail = pr;
//			}
//		}
//	}

	private Node getNode(int index) {
		Node current = head;
		for(int i=0;i<index;i++) {
			current=current.next;
		}
		return current;
	}

	public void traverse() {
		if (head == null) {
			System.out.println("EMPTY ");
			return;
		}
		Node c = head;
		while (c != null) {
			System.out.print(c.data + " ");
			c = c.next;
		}
	}

	public static void main(String[] args) {
		DeleteNodeDoublyLinkedList doubly = new DeleteNodeDoublyLinkedList();
		doubly.insert(1);
		doubly.insert(3);
		doubly.insert(4);
		System.out.println(size);
		doubly.traverse();

	}
}
