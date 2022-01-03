import java.util.*;

public class BinaryTreeUsingArray {

	int[] arr;
	int top = 0;

	void create(int size) {
		arr = new int[size + 1];
		System.out.println("Created ");
	}

	boolean isTreeFull() {
		if (arr.length - 1 == top) {
			return true;
		} else {
			return false;
		}
	}

	public void insert(int data) {
		if (isTreeFull()) {
			System.out.println("tree is full ");
			return;
		}
		arr[top + 1] = data;
		top++;
	}

	public int search(int data) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == data) {
				System.out.println("found at " + i);
				return i;
			}
		}
		return -1;
	}

	public void delete(int data) {
		int temp = search(data);
		if (temp == -1) {
			System.out.println("Value Doesn't exist ");
			return;
		}
		arr[temp] = arr[top];
		top--;
	}

	public void preOrder(int index) {
		if (index > top) {
			return;
		}
		System.out.print(arr[index]);
		preOrder(2 * index); // LEFT = 2X
								// RIGHT = 2X + 1;
		preOrder(2 * index + 1);
	}

	public void inOrder(int index) {
		if (index > top) {
			return;
		}
		inOrder(2 * index);
		System.out.print(arr[index]);
		inOrder(2 * index + 1);
	}

	public void postOrder(int index) {
		if (index > top) {
			return;
		}
		inOrder(2 * index);
		inOrder(2 * index + 1);
		System.out.print(arr[index]);
	}

	public void levelOrder() {
		for (int i = 1; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
		BinaryTreeUsingArray tree = new BinaryTreeUsingArray();
		int size = 7;
		tree.create(size);
		for (int i = 1; i <= size; i++) {
			tree.insert(i);
		}
		System.out.println(tree.top);
		System.out.println(tree.search(5));
		tree.postOrder(1);
		System.out.println();
		tree.levelOrder();
	}
}
