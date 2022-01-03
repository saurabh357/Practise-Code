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

// Recursively In-Order
	public void inO(Node root, List<Integer> list) {
		if (root == null) {
			return;
		}
		inO(root.left, list);
		list.add(root.data);
		inO(root.right, list);
	}

	public List<Integer> inOrderRec() {
		List<Integer> list = new ArrayList<>();
		inO(root, list);
		return list;
	}

	// Iteratively post-order

	public List<Integer> postOrderIterative() {
		LinkedList<Integer> ans = new LinkedList<>();
		Stack<Node> stack = new Stack<>();
		if (root == null)
			return ans;
		stack.push(root);
		while (!stack.isEmpty()) {
			Node cur = stack.pop();
			ans.addFirst(cur.data);
			if (cur.left != null) {
				stack.push(cur.left);
			}
			if (cur.right != null) {
				stack.push(cur.right);
			}
		}
		return ans;
	}

// Recursively Post-Order
	public void helper(Node root, List<Integer> list) {
		if (root == null) {
			return;
		}
		helper(root.left, list);
		helper(root.right, list);
		list.add(root.data);

	}

	public List<Integer> postRec() {
		List<Integer> list = new ArrayList<>();
		helper(root, list);
		return list;
	}

	public List<Integer> levelOrder() {
		List<Integer> list = new ArrayList<>();
		list.add(root.data);
		Node c = root;
		Stack<Node> stack = new Stack<Node>();

		while (c != null || !stack.isEmpty()) {
			if (c.left == null && !stack.isEmpty()) {
				c = stack.pop();
			} else {
				list.add(root.left.data);
			}

			if (c.right != null) {
				list.add(root.right.data);
				stack.push(root.right);
			}
			c = c.left;

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
		System.out.println(tree.levelOrder());
	}
}
