package Binarytree;
import java.util.*;
public class BinaryTreeUsingLinkedList {

	class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data = data;
		}
		Node(int data, Node L, Node R ){
			this.data = data;
			this.left = L;
			this.right = R;
		}
	}
	Node root = null;
	
	public void insert(int data) {
		Node n = new Node(data);
		if(root==null) {
			root = n;
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			Node current = q.remove();
			if(root==null) {
				
			}
			
		}
	}
	public static void main(String[] args) {
		
		

	}

}
