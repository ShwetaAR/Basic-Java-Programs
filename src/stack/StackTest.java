package stack;

public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		//System.out.println("empty: " + stack.isEmpty());
		stack.push(12);
		stack.push(23);
		stack.push(45);
		stack.push(34);
		stack.push(89);
		stack.push(90);
		
/*		
		System.out.println("popped:" + stack.pop());
		System.out.println("peeked" + stack.peek());
		stack.show();

		System.out.println("size: " + stack.size());
		System.out.println("empty: " + stack.isEmpty());*/
		
		StackLL sll = new StackLL();
		sll.push(12);
		sll.push(13);
		
		
		System.out.println(sll.peek());
		System.out.println(sll.pop());
		System.out.println(sll.pop());
		System.out.println(sll.peek());
		sll.show();
		
		java.util.Stack<Integer> s = new java.util.Stack<>();
		s.push(1);
		s.push(2);
		s.push(6);
		System.out.println(s.get(2));
		

	}
}
