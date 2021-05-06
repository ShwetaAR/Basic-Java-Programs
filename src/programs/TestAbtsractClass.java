package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Beta {
	private int a = 90;

	Beta() {
		System.out.println("calling Base");
	}

	Beta(int a) {
		System.out.println(a);
		a = this.a;
		System.out.println(a);
	}
}

public class TestAbtsractClass extends Beta {
	public TestAbtsractClass() {
		System.out.println("calling Test");
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("shweta");
		list.add("ram");
		list.add("yowash");

		System.out.println(Collections.max(list));
		new TestAbtsractClass(12);
		new TestAbtsractClass();
	}

	public TestAbtsractClass(int a) {
		super(a);
		System.out.println(a);
	}
}
