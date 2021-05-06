package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

public class TestTress {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); Tree tree = new Tree(); Node
		 * node = tree.createTree(sc); tree.inOrder(node);
		 */
		BinaryTree.main(args);

	}

}

class BinaryTree {
	Node root;

	public void printLevelOrder() {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()) {

			Node node = q.poll();
			System.out.print(node.data + " ");

			if (node.left != null)
				q.add(node.left);

			if (node.right != null)
				q.add(node.right);

		}

	}

	public static void main(String[] args) {
		BinaryTree tree_level = new BinaryTree();
		tree_level.root = new Node(1);
		tree_level.root.left = new Node(2);
		tree_level.root.right = new Node(3);
		tree_level.root.left.left = new Node(4);
		tree_level.root.left.right = new Node(5);

		System.out.println("Level order traversal of binary tree is - ");
		// tree_level.printLevelOrder();
		tree_level.printRightTree();
	}

	private void printRightTree() {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		while (!q.isEmpty()) {
			int n = q.size();
			//System.out.println("size: " + n);
			for (int i = 1; i <=n; i++) {
				Node node = q.poll();
				// System.out.print(node.data + " ");
				if(i==n){
					System.out.print("->"+node.data+"->");
				}

				if (node.left != null) {
					q.add(node.left);

				}

				if (node.right != null) {
					q.add(node.right);
					//System.out.print(node.data + " ");
				}
			}

		}

	}
}
