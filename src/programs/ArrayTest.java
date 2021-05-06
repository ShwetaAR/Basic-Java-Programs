package programs;

import java.util.Arrays;

class Array {

	private int[] items;
	int count = 0;

	public Array(int length) {
		items = new int[length];
		count = 0;
	}

	// insert
	public void insert(int input) {

		if (count == items.length) {
			int[] newArr = new int[count * 2];
			for (int i = 0; i < count; i++)
				newArr[i] = items[i];

			items = newArr;
		}
		items[count++] = input;
	}

	// prints
	public void print() {
		if (count == 0)
			System.out.println("Empty Array");
		for (int i = 0; i < count; i++)
			System.out.print(items[i]);

		System.out.println();
	}

	// removeAt
	public void removeAt(int i) {
		if (i < 0 || i >= count)
			System.out.print("INVALID INDEX");
		for (int j = i; j < count; j++)
			items[j] = items[j + 1];

		count--;
	}

	// indexOf

	@Override
	public String toString() {
		return "Array [items=" + Arrays.toString(items) + ", index=" + count + "]";
	}

	public int indexOf(int item) {
		for (int i = 0; i < count; i++) {
			if (items[i] == item)
				return i;
		}
		return 0;
	}

}

public class ArrayTest {
	public static void main(String[] args) {
		Array array = new Array(5);
		array.insert(0);
		array.insert(1);
		array.insert(2);
		array.insert(3);
		array.insert(4);
		array.insert(5);
		array.print();
		array.removeAt(3);
		array.print();
		int index = array.indexOf(4);
		System.out.println("Index Of  4= " + index);
		// for (int i = 0; i < 5; i++)
		// /System.out.println(array.getItems());
	}
}
