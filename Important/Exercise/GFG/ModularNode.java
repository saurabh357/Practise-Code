package GFG;

public class ModularNode {

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

	public void insert(int data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			tail = n;
		}
	}

	public int moduarNode(int k) {
		Node mod = null;

		if (head == null || k <= 0) {
			return -1;
		}
		int i = 1;
		for (Node temp = head; temp != null; temp = temp.next) {
			if (i % k == 0) {
				mod = temp;
			}
			i++;
		}
		if (mod == null) {
			return -1;
		}
		return mod.data;
	}

	public static void main(String[] args) {
		ModularNode no = new ModularNode();
		for (int i = 1; i <= 7; i++) {
			no.insert(i);
		}
		System.out.println(no.moduarNode(3));

	}

}
