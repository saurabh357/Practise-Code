package GFG;

public class DeleteAltNodes {
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

	public void deleteAlternate() {
		Node c = head;
		int i = 0;
		while (c != null) {
			System.out.print(c.data+" ");
			c = c.next.next;
		}
	}

	public static void main(String[] args) {
		DeleteAltNodes linked = new DeleteAltNodes();
//		for (int i = 1; i <= 6; i++) {
//			linked.insert(i);
//		}
		linked.insert(99);
		linked.insert(59);linked.insert(42);linked.insert(20);
		linked.deleteAlternate();
	}

}
