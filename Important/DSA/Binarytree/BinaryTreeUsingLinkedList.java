import java.util.*;

class BinaryTreeUsingLinkedList {
	static int size = 0;

	class Node {
		int data;
		Node left = null;
		Node right = null;

		Node(int data) {
			this.data = data;
		}

		Node(int data, Node L, Node R) {
			this.data = data;
			this.left = L;
			this.right = R;
		}
	}

	Node root = null;

	public void insert(int data) {
		Node n = new Node(data);
		if (root == null) {
			root = n;
			size++;
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			Node temp = q.remove();
			if (temp.left == null) {
				temp.left = n;
				size++;
				break;
			} else if (temp.right == null) {
				temp.right = n;
				size++;
				break;
			} else
				q.add(temp.left);
			q.add(temp.right);
		}
	}

	public boolean search(int data) {

		if (root == null) {
			System.out.println("Tree is Empty ");
			return false;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node c = queue.remove();
			if (c.data == data) {
				return true;
			} else {
				if (c.left != null) {
					queue.add(c.left);
				}
				if (c.right != null) {
					queue.add(c.right);
				}
			}
		}
		return false;
	}

	public void deleteDeepestNode() {
		Queue<Node> qu = new LinkedList<Node>();
		qu.add(root);
		Node p = null;
		Node c = null;
		while (!qu.isEmpty()) {
			p = c;
			c = qu.remove();
			if (c.left == null) {
				p.right = null;
				return;
			}
			if (c.right == null) {
				c.left = null;
				return;
			}
			qu.add(c.left);
			qu.add(c.right);
		}
	}

	public Node getDeepestNode() {
		if (root == null) {
			System.out.println("Tree is empty ");
			return null;
		}
		Node current = null;
		Queue<Node> qu = new LinkedList<Node>();
		qu.add(root);
		while (!qu.isEmpty()) {
			current = qu.remove();
			if (current.left != null) {
				qu.add(current.left);
			}
			if (current.right != null) {
				qu.add(current.right);
			}
		}
		return current;
	}

	public void deletNode(int data) {
		if (root == null) {
			System.out.println("Tree is Empty ");
			return;
		}
		Queue<Node> qu = new LinkedList<Node>();
		qu.add(root);
		while (!qu.isEmpty()) {
			Node c = qu.remove();
			if (c.data == data) {
				c.data = getDeepestNode().data;
				deleteDeepestNode();
				break;
			} else {
				if (c.left != null) {
					qu.add(c.left);
				}
				if (c.right != null) {
					qu.add(c.right);
				}
			}
		}
	}

// Iteratively Pre Order
	public List<Integer> preOrderIterative() {
		List<Integer> list = new LinkedList<>();
		Stack<Node> st = new Stack<Node>();

		while (root != null) {
			list.add(root.data);

			if (root.right != null) {
				st.push(root.right);
			}
			if (root.left == null && !st.isEmpty()) {
				root = st.pop();
			} else {
				root = root.left;
			}
		}
		return list;
	}

// Recursively Pre Order
	public void dfs(Node root, List<Integer> list) {
		if (root == null) {
			return;
		}
		list.add(root.data);
		dfs(root.left, list);
		dfs(root.right, list);
	}

	public List<Integer> preOrderRecursive() {
		List<Integer> l = new ArrayList<Integer>();

		dfs(root, l);
		return l;
	}

// Iteratively In Order
	public List<Integer> inOrderIterative() {
		List<Integer> list = new LinkedList<>();
		Stack<Node> sta = new Stack<Node>();
		Node curr = root;
		while (curr != null || !sta.isEmpty()) {
			while (curr != null) {
				sta.push(curr);
				curr = curr.left;
			}
			curr = sta.pop();
			list.add(curr.data);
			curr = curr.right;
		}
		return list;
	}

	// Iteratively post-order

	public List<Integer> postOrderIterative() {
		List<Integer> list = new LinkedList<Integer>();
		Stack<Node> stack1 = new Stack<Node>();
		Stack<Node> stack2 = new Stack<Node>();

		stack2.push(root);
		while (root.left != null) {
			Node c = root.left;
			stack1.push(c);
			if (c.right != null) {
				stack1.push(c.right);
			}
			if (c.left != null) {
				stack1.push(c.left);
			}
			root.left = null;
			while (!stack1.isEmpty()) {
				list.add(stack1.pop().data);
			}
		}

		while (root.right != null) {
			Node c = root.right;
			stack2.push(c);
			if (c.right != null) {
				stack2.push(c.right);
			}
			if (c.left != null) {
				stack2.push(c.left);
			}
			root.right = null;
			while (!stack2.isEmpty()) {
				list.add(stack2.pop().data);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		BinaryTreeUsingLinkedList tree = new BinaryTreeUsingLinkedList();
		for (int i = 1; i <= 7; i++) {
			tree.insert(i);
		}
//		System.out.println(size);
//		System.out.println(tree.search(5));
//		tree.deletNode(15);
//		tree.deletNode(10);
		// System.out.println(tree.preOrderIterative());
		System.out.println(tree.postOrderIterative());
//		System.out.println(tree.preOrderIterative());
//		System.out.println(tree.preOrderIterative());
	}
}
