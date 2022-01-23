
public class doub {
static int size =0;
	class Node{
		int data;
		Node prev = null;
		Node next = null;
		Node(int data){
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}
	Node head= null;
	Node tail = null;
	public void insert(int data) {
		Node n = new Node(data);
		if(head==null) {
			head=tail=n;
			size++;
		}
		else {
			n.prev = tail;
			tail.next = n;
			tail=n;
			size++;
		}
	}
	public void traverse() {
		if(head==null) {
			System.out.println("empty ");
			return;
		}
		Node c = head;
		while(c!=null) {
			System.out.print(c.data);
			c=c.next;
		}
	}
	public boolean search(int data) {
		if(head==null) {
			return false;
		}
		Node c = head;
		while(c!=null) {
			if(c.data == data) {
				return true;
			}
			c=c.next;
		}
		return false;
		
	}
	public Node getNode(int in) {
		Node c = head;
		for(int i=0;i<in;i++) {
			c=c.next;
		}
		return c;
	}
	public void deleteAtIndex(int index) {
		if(index < 0 || index>=size) {
			return;
		}
		if(index==0) {
			head=head.next;
			head.prev = null;
		}
		else {
			Node p = getNode(index-1);
			p.next=null;
			p.next=p.next.prev;
			p.next.prev = p.next;
		}
	}
	public static void main(String[] args) {
		doub d = new doub();
		d.insert(1);
		d.insert(2);
		d.insert(3);
		d.insert(4);
		d.insert(5);
		d.traverse();
		System.out.println();
		System.out.println(size);
		System.out.println(d.search(0));
	}

}
