package stack;

class Node {
	int data;
	Node next;

	public Node(int data) {
		Node node;
		this.data = data;
		this.next = null;
	}
}

public class StackLL {
	Node first;

	public StackLL() {
		this.first = null;
	}

	public void push(int data) {
		Node node = new Node(data);
		node.next = this.first;
		this.first = node;
	}

	public int peek() {
		if (this.first == null)
			System.out.println("Stack is empty");
		else {
			System.out.println("Peek: " + this.first.data);

			return this.first.data;
		}
		return -1;

	}

	public int pop() {
		if (this.first == null)
			System.out.println("Stack is empty");
		else {
			Node n = first;
			System.out.println("Pop: "+n.data);
			first = n.next;
			return n.data;
		}
		return -1;
	}

	public void show() {
		Node n = first;
		System.out.println("***********SHOW DATA*********");
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
}
