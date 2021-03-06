package Queue;

public class QueueUsingLinkedList {

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node front = null;
	Node rear = null;

	public void enQueue(int data) {
		Node n = new Node(data);
		if (front == null) {
			front = n;
			rear = n;
		} else {
			rear.next = n;
			rear = n;
		}
	}

	public void deQueue() {
		if (front == null) {
			System.out.println("Queue is Empty ");
			return;
		} else {
			System.out.println(front.data);
			front = front.next;
			if (front == null) {
				rear = null;
			}
		}
	}

	public void print() {
		Node current = front;
		if (front == null) {
			System.out.println("Queue is Empty ");
			return;
		}
		System.out.println("Elements are ");
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public void deleteQueue() {
		front = null;
		rear = null;
	}

	public static void main(String[] args) {
		QueueUsingLinkedList list = new QueueUsingLinkedList();
		list.enQueue(5);
		list.enQueue(4);
		list.enQueue(6);
		list.enQueue(2);
		list.print();
		list.deQueue();
		list.deQueue();
		list.print();
	}

}
