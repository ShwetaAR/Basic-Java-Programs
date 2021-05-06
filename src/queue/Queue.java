package queue;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Queue {

	Node front;
	Node rear;
	int size;

	public Queue() {
		this.front = null;
		this.rear = null;
		this.size = 0;
	}

	public void queue(int data) {
		Node node = new Node(data);
		if (front == null && rear == null) {
			this.front = node;
			this.rear = node;
			size++;
		} else {
			Node n = rear;
			this.rear.next = node;
			this.rear = node;
			size++;
		}
	}

	public void show() {
		if (front == null) {
			System.out.println("Empty Queue");
		} else {
			Node node = this.front;
			while (node.next != null) {
				System.out.println(node.data);
				node = node.next;
			}
			System.out.println(node.data);
		}

	}

	public void dequeue() {
		if (front == null) {
			System.out.println("Empty queue");
		} else {
			Node node = this.front;
			front = node.next;
		}

	}
}
