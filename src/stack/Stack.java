package stack;

public class Stack {

	int top;
	int[] stack;
	int size;

	public Stack(int size) {
		this.size = size;
		stack = new int[size];
		top = 0;
	}

	public void push(int data) {
		if (top == size) {
			int[] newstack = new int[size*2];
			for (int i = 0; i < size; i++) {
				newstack[i] = stack[i];
			}
			size *= 2;
			stack = newstack;
		}
		stack[top++] = data;
	}

	public void show() {
		for (int i = 0; i < top; i++)
			System.out.print(stack[i] + "  ");
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Empty Stack");
		} else {
			top--;
			int data = stack[top];
			System.out.println(data);
			stack[top] = 0;
			return data;
		}
		return -1;

	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		if (top <= 0)
			return false;
		return true;
	}

	public int peek() {
		if (top == 0) {
			System.out.println("Empty Stack");
		} else {
			int data = stack[top - 1];
			return data;
		}
		return -1;

	}

}
