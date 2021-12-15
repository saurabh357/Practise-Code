package Stack;

public class StackUsingArray {
	int sizeOfArray = 5;
	int[] arr = new int[sizeOfArray];
	int top = -1;

	public void push(int data) {
		if (arr.length - 1 == top) {
			System.out.println("Stack Overflow ");
			return;
		} else {
			arr[top + 1] = data;
			top++;
			System.out.println("Inserted ");
		}
	}

	public void pop() {
		if (top == -1) {
			System.out.println("Stack is UnderFlow ");
			return;
		} else {
			System.out.println(arr[top]);
			top--;
		}
	}

	public void peek() {
		if (top == -1) {
			System.out.println("Stack is UnderFlow ");
			return;
		} else {
			System.out.println(arr[top]);
		}
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (arr.length - 1 == top) {
			return true;
		} else {
			return false;
		}
	}

	public void deleteStack() {
		arr = null;
	}

	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray();
		stack.push(1);
		stack.push(3);
		stack.push(5);
		stack.pop();
		stack.peek();
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
	}
}
