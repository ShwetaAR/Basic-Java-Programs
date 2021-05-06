package linkedlist;

public class LinkedListImplementation {

	Node first;
	Node last;

	// add
	public void add(int data) {
		Node node = new Node();
		node.value = data;
		node.next = null;

		if (first == null) {
			first = node;
		} else {
			Node n = first;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;

		}

	}

	// print
	public void print() {
		Node node = first;
		while (node.next != null) {
			System.out.println(node.value);
			node = node.next;
		}
		System.out.println(node.value);
	}

	// addFirst
	public void addFirst(int item) {
		Node node = new Node();
		node.value = item;
		node.next = null;
		node.next = first;
		first = node;

	}

	// addAt
	public void addAt(int index_, int value) {

		Node node = new Node();
		node.value = value;

		if (index_ == 0) {
			// addFirst(value);
		} else {

			int i = 0;
			Node n = first;
			while (i != index_ - 1) {
				n = n.next;
				i++;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	// get 23 0 45 1 67 2 78 3
	public int get(int index) {
		int data;
		Node n = first;
		for (int i = 0; i < index; i++) {
			n = n.next;
		}
		System.out.println("get:: index:: " + index + ":  " + n.value);
		return n.value;
	}

	// delete

	private void delete(int index) {

		if (index == 0) {
			first = first.next;
		} else {
			int i = 0;
			Node n = first;
			while (i != index - 1) {
				n = n.next;
				i++;
			}
			Node n1 = n.next;
			n.next = n1.next;

		}
	}

	public static void main(String[] args) {
		LinkedListImplementation list = new LinkedListImplementation();
		list.add(2);
		list.add(3);
		list.add(3);
		list.addFirst(4);
		list.addAt(1, 9);
		list.print();
		int index = 4;
		list.delete(index);
		System.out.println("After deletion");
		list.print();

		list.get(9);
	}

}
