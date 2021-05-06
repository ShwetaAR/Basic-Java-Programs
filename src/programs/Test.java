package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import linkedlist.Test1_1;

class Base {
	int number;

	Base(int number) {
		this.number = number;
	}

}

class Child extends Base {

	Child(int number) {
		super(number);
		// TODO Auto-generated constructor stub
	}

}

class A {
	{
		System.out.println("A");
	}

}

class B extends A {
	{
		System.out.println("b");
	}

}

class C extends B {
	{
		System.out.println("c");
	}

}

class Person {
	String firstName;

	public Person(String firstName) {
		super();
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Person() {

	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + "]";
	}

}

class MyTest<T> {

	public void add(T t) {
		System.out.println(t);

	}
}

class Thread4 {

	public static void main(String[] args) {
		// new Thread4().go();
	}

	/*
	 * private void go() { Runnable run = new Runnable() {
	 * 
	 * @Override public void run() { System.out.println("foooo"); } };
	 * 
	 * Thread t = new Thread(); t.start(); t.start();
	 * 
	 * }
	 */
}

public class Test {

	static Test t;
	static int count = 0;

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Test t1 = new Test(); t1 = null; System.gc(); Thread.sleep(1000);
		 * System.gc(); Thread.sleep(1000); System.out.println("called" +
		 * count);
		 */

		//method(int 1){
			
		//}
		

		/*
		 * MyTest<Number> myadd = new MyTest<Number>(); myadd.add(new
		 * Integer(1)); myadd.add(new Double(1.9)); System.out.println(myadd);
		 * 
		 * 
		 * B b = new C(); Person p1 = new Person("Shweta"); Person p2 = new
		 * Person("Ram"); List<Person> persons = new ArrayList<Person>();
		 * persons.add(p2); persons.add(p1); Iterator it = persons.iterator();
		 * while (it.hasNext()) { System.out.println(it.next());
		 * //persons.add(new Person("RAM SOMANI")); }
		 * 
		 * TreeSet<String> set = new TreeSet<String>(); //set.add(null);
		 * set.add("as"); //System.out.println(set);
		 */
		List<String> names = Arrays.asList("s", "r", "q", "p", "a", "b", "c", "d");
		String target = "a";
		int startIndex = 3;
		int rightmove = 0;
		int minimumMoves = 0;
		boolean isDataPresent = false;

		int lenghtFromStartIndex = names.size() - 5;
		System.out.println("lenghtFromStartIndex: " + lenghtFromStartIndex);
		for (int i = startIndex; i < names.size(); i++) {
			rightmove++;
			if (names.get(i).equalsIgnoreCase(target)) {

				isDataPresent = true;
				break;
			}
		}
		if (!isDataPresent) {
			isDataPresent = false;
			rightmove = 0;
		} else
			isDataPresent = false;
		if (rightmove == 0) {

			for (int i = 0; i < startIndex; i++) {
				rightmove++;
				if (names.get(i).equalsIgnoreCase(target)) {
					isDataPresent = true;
					break;
				}

			}

			if (isDataPresent) {
				rightmove = rightmove + lenghtFromStartIndex;
				isDataPresent = false;
			} else {
				rightmove = 0;
				isDataPresent = false;
			}
		}

		System.out.println("Right Move" + rightmove);
		int leftmove = 0;
		for (int i = startIndex; i >= 0; i--) {
			leftmove++;
			if (names.get(i).equalsIgnoreCase(target)) {
				isDataPresent = true;
				break;
			}
		}
		if (!isDataPresent) {
			leftmove = 0;
			isDataPresent = false;
		} else
			isDataPresent = false;

		if (leftmove == 0) {
			for (int i = names.size() - 1; i > startIndex; i--) {
				leftmove++;
				if (names.get(i).equalsIgnoreCase(target)) {
					isDataPresent = true;
					break;
				}
			}
			if (isDataPresent) {
				leftmove = leftmove + lenghtFromStartIndex;
			} else
				isDataPresent = false;

		}
		System.out.println("Left  Move" + leftmove);
		if (leftmove < rightmove && leftmove != 0) {
			minimumMoves = leftmove;
		} else

		if (rightmove < rightmove && rightmove != 0) {
			minimumMoves = rightmove;
		}

		System.out.println("minimumMoves----->" + minimumMoves);

		// if(right)

	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		count++;
		t = this;

	}

}
