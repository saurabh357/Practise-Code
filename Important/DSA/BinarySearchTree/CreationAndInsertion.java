package BinarySearchTree;

import java.util.*;

public class CreationAndInsertion {
	public static boolean flag = false;

	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	Node root = null;

	public void create(int data) {
		root = insert(root, data);
	}

	public Node insert(Node root, int data) {
		Node n = new Node(data);
		if (root == null) {
			root = n;
			return root;
		} else if (data > root.data) {
			root.right = insert(root.right, data);
			return root;
		} else {
			root.left = insert(root.left, data);
			return root;
		}
	}

	// Traversal

	// INOrder
	public void inOrder(Node root, List<Integer> list) {
		if (root == null)
			return;

		inOrder(root.left, list);
		System.out.print(root.data);
		inOrder(root.right, list);
	}

	public List<Integer> in() {
		List<Integer> list = new LinkedList<>();
		inOrder(root, list);
		return list;
	}

	// PreOrder
	public void preOrder(Node root, List<Integer> list) {
		if (root == null)
			return;

		System.out.print(root.data);
		inOrder(root.left, list);
		inOrder(root.right, list);
	}

	public List<Integer> pre() {
		List<Integer> list = new LinkedList<>();
		preOrder(root, list);
		return list;
	}

	// PostOrder
	public void postOrder(Node root, List<Integer> list) {
		if (root == null)
			return;

		inOrder(root.left, list);
		inOrder(root.right, list);
		System.out.print(root.data);
	}

	public List<Integer> post() {
		List<Integer> list = new LinkedList<>();
		postOrder(root, list);
		return list;
	}

	// Search Value in Tree

	public void find(int data) {
		search(root, data);
	}

	public void search(Node root, int data) {

		if (root == null) {
			flag = false;
		} else {
			if (root.data == data) {
				flag = true;
			}
			if (flag == false && root.left != null) {
				search(root.left, data);
			}
			if (flag == false && root.right != null) {
				search(root.right, data);
			}
		}
		if (flag == false) {
			System.out.println("Not found");
		} else {
			System.out.println("Found");
		}
		return;

	}

	public Node minNode(Node root) {
		if (root.left == null) {
			return root;
		} else {
			return minNode(root.right);
		}
	}

	public Node deleteNode(Node root, int data) {
		if (root == null) {
			System.out.println("Tree is empty ");
			return null;
		} // 9
		if (data > root.data) {
			root.right = deleteNode(root.right, data);
		} else if (data < root.data) {
			root.left = deleteNode(root.left, data);
		} else {
			if (root.left != null && root.right != null) {
				Node temp = root;
				Node min = minNode(root.right);
				root.data = min.data;
				root.right = deleteNode(root.right, min.data);
			} else if (root.left != null) {
				root = root.left;
			} else if (root.right != null) {
				root = root.right;
			} else {
				root = null;
			}
		}
		return root;
	}

	public void delete(int data) {
		deleteNode(root, data);
	}

	public void deleteBST() {
		root = null;
	}

	public static void main(String[] args) {
		CreationAndInsertion BST = new CreationAndInsertion();
		BST.create(8);
		BST.create(3);
		BST.create(9);
		BST.create(1);
		BST.create(6);
		BST.create(4);

		// BST.in();
		// BST.pre();
		// BST.post();
		// BST.find(1);
		// BST.delete(9);

	}
}
