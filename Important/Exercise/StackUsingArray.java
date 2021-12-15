
public class StackUsingArray {
	int[] arr = new int[5];
	int top = 0;

	void push(int x) {
		top++;
		arr[top] = x;
		System.out.println("element inserted : " + x);
		return;
	}

	int pop() {
		int x = arr[top--];
		System.out.println("element pop :" + x);
		return x;
	}

	int peek() {
		return arr[top];
	}

	public static void main(String[] args) {
		StackUsingArray s = new StackUsingArray();
		s.push(5);
		s.push(10);
		s.push(15);
		s.push(20);
		s.pop();
		System.out.println(s.peek());
	}

}
