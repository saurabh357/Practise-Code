package GFG;

public class IdenticalLinkedList {
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
		Node head1 = null;
		Node tail1 = null;
		static int size = 0;
		static int size1 = 0;

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
		public void insertSec(int data) {
			Node n1 = new Node(data);
			if (head1 == null) {
				head1 = n1;
				tail1 = n1;
				size1++;
			} else {
				tail1.next = n1;
				tail1 = n1;
				size1++;
			}
		}

		 public boolean isIdentical (){
		        if(size1 != size) {
		        	return false;
		        }
		        Node c1 = head;
		        Node c2 = head1;
		        
		        while(c1!=null || c2!=null){
		            if(c1.data != c2.data){
		                return false;
		            }
		            c1=c1.next;
		            c2=c2.next;
		        }
		    return true;
		    }

		public static void main(String[] args) {
			IdenticalLinkedList linked = new IdenticalLinkedList();
			for (int i = 1; i <= 6; i++) {
				linked.insert(i);
			}
			for (int i = 1; i <= 6; i++) {
				linked.insertSec(i);
			}
			
			System.out.println(linked.isIdentical());
		}

	}
