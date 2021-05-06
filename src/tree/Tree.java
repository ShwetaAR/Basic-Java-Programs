package tree;

import java.util.Scanner;

class Node {
	Node left, right;
	int data;

	public Node(int data) {
		this.data = data;
	}
}

public class Tree {

	public Node createTree(Scanner sc) {
		Node root = null;
		System.out.println("Enter data");
		int data = sc.nextInt();
		if (data == -1)
			return null;
		root = new Node(data);
		System.out.println("Enter left child of " + data);
		root.left = createTree(sc);

		System.out.println("Enter right child of " + data);
		root.right = createTree(sc);

		return root;

	}

	public void inOrder(Node root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);

	}
}
