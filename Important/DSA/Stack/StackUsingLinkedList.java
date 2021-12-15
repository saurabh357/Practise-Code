package Stack;

public class StackUsingLinkedList {

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

	public void push(int data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			tail = n;
		}
		size++;
	}

	public void pop() {
		Node current = head;
		if (head == null) {
			System.out.println("Stack is Underflow ");
			return;
		}
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		size--;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	public void peek() {
		if (head == null) {
			System.out.println("Empty Stack ");
		} else {
			System.out.println(head.data);
		}
	}

	public static void main(String[] args) {

		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(5);
		stack.push(6);
		stack.push(57);
		// System.out.println(size);
		stack.pop();
		stack.peek();
		System.out.println(stack.isEmpty());

	}
}
