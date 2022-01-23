package GFG;

public class linkedlistofstringsformsapalindrome {

	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;
	Node tail = null;
	static int size = 0;

	public void addNode(String data) {
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

	public boolean compute() {

		String temp = "";
		String temp1 = "";
		Node c = head;
		while (c != null) {
			temp = temp + c.data;
			temp1 = c.data + temp1;
			c = c.next;
		}
		System.out.println(temp + " "+temp1);
		if (temp.equals(temp1)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		linkedlistofstringsformsapalindrome list = new linkedlistofstringsformsapalindrome();
		list.addNode("a");
		list.addNode("bc");
		list.addNode("d");
		list.addNode("dcb");
		list.addNode("a");
		// list.addNode(6);
		System.out.println(list.compute());
		// System.out.println(list.sum(2));
	}
}
