import java.util.Stack;


public class SinglyLinkedList {

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

//	public void addNode(int data) {
//		Node n = new Node(data);
//		if (head == null) {
//			head = n;
//			tail = n;
//			size++;
//		} else {
//			tail.next = n;
//			tail = n;
//			size++;
//		}
//	}
	boolean isCircular() {
		boolean b = false;
		if(tail.next == head) {
			b = true;
		}
		return b;
	}
	public void addAtHead(int data) {
		Node n = new Node(data);
		if (size == 0) {
			head = tail = n;
		} else {
			tail.next = n;
			tail = n;
		}
		size++;
	}

	public void addAtTail(int data) {
		Node n = new Node(data);
		if (size == 0) {
			head = tail = n;
		} else {
			tail.next = n;
			tail = n;
		}
		size++;
	}

	public void addAtIndex(int data, int index) {
		Node n = new Node(data);
		if ((index < 0) || (index > size)) {
			return;
		}
		if (index == 0) {
			addAtHead(data);
		} else if (index == size) {
			addAtTail(data);
		} else {
			Node prev = getNode(index - 1);
			n.next = prev.next;
			prev.next = n;
		}
		size++;
	}
	public int count() {
		int c = 0;
		if(head==null) {
			return 0;
		}
		Node curr = head;
		while(curr!=null) {
			c++;
			curr=curr.next;
		}
		return c;
	}

	public void print() {
		Node current = head;
		if (head == null) {
			System.out.println("LinkedList is Empty ");
			return;
		}
		System.out.println("Linkedlist Elements is - ");
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public Node getNode(int index) {
		Node p = head;
		for (int i = 0; i < index; i++) {
			p = p.next;
		}
		return p;
	}

	public void delete(int index) {
		if (index < 0 || index >= size) {
			return;
		}
		if (index == 0) {
			head = head.next;
		} else {
			Node prevNode = getNode(index - 1);
			prevNode.next = prevNode.next.next;
			if (index == size - 1) {
				tail = prevNode;
			}
		}
		size--;
	}

	public int search(int data) {
		Node c = head;
		if (head == null)
			return -1;
		for (int i = 0; i < size; i++) {
			if (c.data == data) {
				return i;
			}
			c = c.next;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addAtHead(5);
		list.addAtHead(4);
		list.addAtHead(3);
		list.addAtHead(2);
		list.addAtHead(7);
		list.addAtHead(6);
		list.addAtTail(6);
		list.addAtIndex(6, 3);
		list.print();
		System.out.println(list.search(50));
		
		
		
		System.out.println();
		System.out.println(list.count());

		System.out.println(list.isCircular());
		//System.out.println(list.sum(2));
	}

}


























