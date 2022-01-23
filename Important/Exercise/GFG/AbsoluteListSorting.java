package GFG;

public class AbsoluteListSorting {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// Represent the head and tail of the singly linked list
	public Node head = null;
	public Node tail = null;

	// addNode() will add a new node to the list
	public void addNode(int data) {
		// Create a new node
		Node newNode = new Node(data);

		// Checks if the list is empty
		if (head == null) {
			// If list is empty, both head and tail will point to new node
			head = newNode;
			tail = newNode;
		} else {
			// newNode will be added after tail such that tail's next will point to newNode
			tail.next = newNode;
			// newNode will become new tail of the list
			tail = newNode;
		}
	}

	// sortList() will sort nodes of the list in ascending order
	public void sortList() {
		// Node c = head;
		for (Node temp = head; temp != null; temp = temp.next) {
			for (Node temp1 = head.next; temp1 != null; temp1 = temp1.next) {
				if (temp.data > temp1.data) {
					int temp3 = temp.data;
					temp.data = temp1.data;
					temp1.data = temp3;
				}
			}
		}

	}

	// display() will display all the nodes present in the list
	public void display() {
		// Node current will point to head
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (current != null) {
			// Prints each node by incrementing pointer
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	

	public static void main(String[] args) {

		AbsoluteListSorting sList = new AbsoluteListSorting();

		// Adds data to the list
		sList.addNode(9);
		sList.addNode(7);
		sList.addNode(2);
		sList.addNode(5);
		sList.addNode(4);

		// Displaying original list
		System.out.println("Original list: ");
		sList.display();

		// Sorting list
		sList.sortList();

		// Displaying sorted list
		System.out.println("Sorted list: ");
		sList.display();
	}
}
