package Stack;

public class Apple {
	int size = 5;
	int[] arr = new int[size];
	int front = -1;
	int rear = -1;

	public void push(int data) {
		if (rear == size - 1) {
			return;
		} else {
			if(rear==-1) {
				front=0;
				rear++;
				arr[rear] = data;
				
			}
			else {
				rear++;
				arr[rear] = data;
			}
		}
	}

	public void pop() {
		if(front == -1) {
			return;
		}
		else {
			System.out.println(arr[front]);
			arr[front] = 0;
			rear--;
		}
	}
	public static void main(String[] args) {
		Apple a = new Apple();
		a.push(1);
		a.push(2);
		a.push(3);
		a.push(4);
		a.push(5);
		System.out.println(a.front+" "+a.rear);
		a.pop();
		//System.out.println(a.top);
	}
}
