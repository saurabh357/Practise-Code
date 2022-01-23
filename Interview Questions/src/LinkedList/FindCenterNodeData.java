package LinkedList;

public class FindCenterNodeData {
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

	public void traverse() {
		if (head == null) {
			System.out.println("LinkedList is Empty ");
			return;
		}
		Node c = head;
		while (c != null) {
			System.out.print(" " + c.data);
			c = c.next;
		}
	}

	public int centerNodeData() {
		if (head == null) {
			System.out.println("LinkedList is empty");
		}
//		int ans = 0;
//		int mid = size / 2;
//		Node c = head;
//		for (int i = 0; i <= mid; i++) {
//			ans = c.data;
//			c = c.next;
//		}
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public static void main(String[] args) {
		FindCenterNodeData linked = new FindCenterNodeData();
		for (int i = 1; i <= 5; i++) {
			linked.insert(i);
		}
	//	linked.insert(2);linked.insert(4);linked.insert(6);linked.insert(7);linked.insert(5);linked.insert(1);
		linked.traverse();
		System.out.println();
		System.out.println("Mid element in the linkedlist " + linked.centerNodeData());
	}

}
