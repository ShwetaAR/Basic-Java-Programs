package programs;

import java.util.ArrayList;
import java.util.List;

class A_ {
	A_ a = new A_();
	List<Integer> list = new ArrayList<Integer>();

	void method() {
	}
}

final public class Test_5 {
	String name;

	public static void main(String[] args) {

		String obj = "Shweta";
		System.out.println(obj);
		String s1 = obj.concat("baberia");
		System.out.println(s1);
		int count = 0;
		int[] arr = { 1, 0, 1, 0, 0 };
		for (int p = 0; p < arr.length; p++) {
			if (arr[p] == 1) {
				count++;
			}
		}
		int zerosCount = arr.length - count;
		System.out.println("zeros-->" + zerosCount);
		System.out.println("ones_count-->" + count);
		for (int j = 0; j < arr.length; j++) {
			if (j < 3) {
				arr[j] = 0;
			} else
				arr[j] = 1;
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println("arr:" + arr[j]);
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

	}

}
