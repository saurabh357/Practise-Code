package GFG;

import java.util.Stack;

public class FindtheSumofLastNnodesoftheLinkedList {

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
	public int sum(int k) {
		int sum =0;
		Stack<Integer> stack = new Stack<>();
		Node c = head;
		while(c!=null) {
			stack.push(c.data);
			c=c.next;
		}
		for(int i=1;i<=k;i++) {
			int pop = stack.pop();
			sum += pop;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		FindtheSumofLastNnodesoftheLinkedList list = new FindtheSumofLastNnodesoftheLinkedList();
		list.addAtHead(5);
		list.addAtHead(4);
		list.addAtHead(3);
		list.addAtHead(2);
		list.addAtHead(7);
		list.addAtHead(6);
		
		System.out.println(list.sum(2));
	}

}


























