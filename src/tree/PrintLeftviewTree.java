package tree;

import java.util.ArrayDeque;
import java.util.Queue;

// A class to store a binary tree node
class Node_1 {
	int key;
	Node_1 left = null, right = null;

	Node_1(int key) {
		this.key = key;
	}
}

public class PrintLeftviewTree {
	// Iterative function to print the left view of a given binary tree
	public static void leftView(Node_1 root) {
		// return if the tree is empty
		if (root == null) {
			return;
		}

		// create an empty queue and enqueue the root node
		Queue<Node_1> queue = new ArrayDeque<>();
		queue.add(root);

		// to store the current node
		Node_1 curr;

		// loop till queue is empty
		while (!queue.isEmpty()) {
			// calculate the total number of nodes at the current level
			int size = queue.size();
			int i = 0;

			// process every node of the current level and enqueue their
			// non-empty left and right child
			while (i++ < size) {
				curr = queue.poll();

				// if this is the first node of the current level, print it
				if (i == 1) {
					System.out.print(curr.key + " ");
				}

				if (curr.left != null) {
					queue.add(curr.left);
				}

				if (curr.right != null) {
					queue.add(curr.right);
				}
			}
		}
	}

	public static void main(String[] args) {
		Node_1 root = new Node_1(1);
		root.left = new Node_1(2);
		root.right = new Node_1(3);
		root.left.right = new Node_1(4);
		root.right.left = new Node_1(5);
		root.right.right = new Node_1(6);
		root.right.left.left = new Node_1(7);
		root.right.left.right = new Node_1(8);

		leftView(root);
	}
}
