
public class sing {

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

	public void insertAtStart(int data) {
		Node n = new Node(data);
		if (size == 0) {
			head = tail = n;
		} else {
			n.next = head;
			head = n;
		}
		size++;
	}

	public void insertAtEnd(int data) {
		Node n = new Node(data);
		if (size == 0) {
			head = tail = n;
		} else {
			tail.next = n;
			tail = n;
		}
		size++;
	}

	public Node getNode(int in) {
		Node p = head;
		for (int i = 0; i < in; i++) {
			p = p.next;
		}
		return p;
	}

	public void addAtIndex(int data, int index) {
		Node n = new Node(data);
		if ((index < 0) || (index > size)) {
			return;
		}
		if (index == 0) {
			insertAtStart(data);
		} else if (index == size) {
			insertAtEnd(data);
		} else {
			Node prev = getNode(index - 1);
			n.next = prev.next;
			prev.next = n;
		}
		size++;
	}

	public void traverse() {
		Node c = head;
		if (head == null) {
			System.out.println("empty ");
			return;
		}

		while (c != null) {
			System.out.print(c.data);
			c = c.next;
		}
	}

	public int search(int data) {
		if (head == null) {
			System.out.println("empty ");
			return -1;
		}
		Node c = head;
		int i = 1;
		while (c != null) {
			if (c.data == data) {
				return i;
			}
			i++;
			c = c.next;
		}
		return -1;
	}

	public void delete(int data) {
		Node c = head;
		if (head == null) {
			System.out.println("empty ");
			return;
		} else {
			int index = search(data);
			Node prev = getNode(index - 2);
			prev.next = prev.next.next;
		}
		size--;
	}
	public void deleteEntireList() {
		head=tail=null;
		size=0;
	}
	
	public void reverseLinkedList() {
		if(head==null) {
			System.out.println("list is empty ");
			return;
		}
		
		Node c = head;
		
	}

	public static void main(String[] args) {

		sing list = new sing();

		list.insert(5);
		list.insert(6);
		list.insert(8);
		list.insert(10);
		list.insert(15);
		// System.out.println(list.search(10));
//		list.insertAtStart(10);
//		list.addAtIndex(25, 1);
//		list.insertAtEnd(55);
		list.traverse();
		list.delete(10);
		list.deleteEntireList();;
		list.traverse();
		System.out.println(list.size);
	}
}
