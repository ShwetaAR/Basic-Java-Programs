package telusko;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestLinkedList {
	public static void main(String[] args) {

		telusko.LinkedList list = new telusko.LinkedList();
		list.insert(2);
		list.insert(3);
		list.insert(3);
		list.insertAtStart(4);
		// list.addAt(1, 3);
		list.show();

		java.util.LinkedList< Integer> lis = new LinkedList<>();
		
		lis.push(9);
		System.out.println(lis);
		ArrayList lism;
	}

}
