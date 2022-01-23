package GFG;

import java.util.*;

public class impStackUsingLinkedList {
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node top = null;

	public void push(int a) {

		Node n = new Node(a);
		if (top == null) {
			top = n;
		} else {
			n.next = top;
			top = n;
		}
	}

	public int pop() {
		int pop = 0;
		Node temp = top;
		if (temp == null) {
			return -1;
		} else {
			temp = temp.next;
			pop = top.data;
			top = temp;
		}

		return pop;
	}
	
	public void traverse() {
		if(top==null) {
			System.out.println("Stack is empty ");
			return;
		}
		Node c = top;
		while(c!=null) {
			System.out.print(c.data+" ");
			c=c.next;
		}
	}

	public static void main(String[] args) {

		impStackUsingLinkedList list = new impStackUsingLinkedList();
		list.push(2);
		list.push(3);
		list.traverse();
		System.out.println(list.pop());
		list.push(4);
		list.traverse();
		System.out.println(list.pop());
		list.traverse();
	}

}
