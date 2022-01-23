package Queue;

public class QueueUsingLinearArray {

	int[] arr;          
	int front;
	int rear;

	public void createQueue(int size) {
		arr = new int[size];
		front = -1;
		rear = -1;
	}
	public void enqueue(int data) {
		if (arr.length - 1 == rear) {
			System.out.println("Queue is Full ");
			return;
		} else if (rear == -1) {
			rear++;
			front = 0;
			arr[rear] = data;
		} else {
			rear++;
			arr[rear] = data;
		}
	}

	public void dequeue() {
		if (rear == -1) {
			System.out.println("Queue is empty ");
			return;
		} else {
			System.out.println(arr[front]);
			arr[front] = 0;
			front++;
			if (front > rear) {
				front = rear = -1;
			}
		}
	}

	public void print() {
		if (rear == -1) {
			System.out.println("Queue is empty ");
			return;
		}
		else {
			System.out.println(arr[front]);
			front++;
		}
	}
	public void peek() {
		if(front==-1) {
			System.out.println("queue is empty ");
			return;
		}
		else {
			System.out.println(arr[front]);
		}
	}
	public void deleteQueue() {
		arr = null;
	}
	public static void main(String[] args) {
		QueueUsingLinearArray queue = new QueueUsingLinearArray();
		queue.createQueue(5);
		queue.enqueue(5);
		queue.enqueue(4);
		queue.enqueue(3);
		queue.enqueue(2);
		queue.enqueue(1);
		//queue.deleteQueue();
//		queue.dequeue();
//		queue.peek();
		queue.print();
	}
}
