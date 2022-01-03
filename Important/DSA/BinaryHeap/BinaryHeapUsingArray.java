package BinaryHeap;

public class BinaryHeapUsingArray {

	int[] arr = new int[6];
	int size = 0;

	public void bottomToTop(int index) {
		if (index <= 1) {
			return;
		}
		int parent = index / 2;
		if (arr[parent] > arr[index]) {
			int temp = arr[parent];
			arr[parent] = arr[index];
			arr[index] = temp;

		}
		bottomToTop(parent);

	}

	public void insert(int data) {
		arr[size + 1] = data;
		size++;
		bottomToTop(size);
	}

	public boolean isEmpty() {
		if (arr.length - 1 == size) {
			return false;
		} else {
			return true;
		}
	}

	public void peek() {
		if (size <= 0) {
			System.out.println("Value doesn't exist ");
		} else {
			System.out.println(arr[1]);
		}
	}

	public void heapify(int index) {
		int left = 2 * index;
		int right = (2 * index) + 1;
		int smallestChild = 0;
		// current Node has no child
		if (size < left) {
			return;
		}
		// current node has one child
		else if (size == left) {
			if (arr[index] > arr[left]) {
				int temp = arr[index];
				arr[index] = arr[left];
				arr[left] = temp;
			}
		} else {
			if (arr[left] < arr[right]) {
				smallestChild = left;
			} else {
				smallestChild = right;
			}

			if (arr[index] > arr[smallestChild]) { // If Parent is greater than smallest child, then swap
				int tmp = arr[index];
				arr[index] = arr[smallestChild];
				arr[smallestChild] = tmp;
			}
		}
		heapify(smallestChild);
	}

	public int extract() {
		if (size <= 0) {
			System.out.println("can not extract because heap is empty ");
			return -1;
		}
		int e = arr[1];
		arr[1] = arr[size];
		size--;
		heapify(1);
		return e;
	}

	public static void main(String[] args) {
		BinaryHeapUsingArray arr = new BinaryHeapUsingArray();
		arr.insert(6);
		arr.insert(4);
		arr.insert(5);
		arr.insert(1);
		arr.insert(7);
		System.out.println(arr.size);
		System.out.println(arr.isEmpty());
		arr.peek();
		arr.extract();
	}
}
