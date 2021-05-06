package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wissen /* extends Thread */ {
	/*
	 * @Override public void run() { System.out.println("run slow"); }
	 */

	public static void main(String[] args) {
		/*
		 * Wissen w = new Wissen(); w.start();
		 */
		int[] arr = { 2, 5, 6, 1 };
		// System.out.println(countOvertake(arr.length, arr));
		String str = "Be not afraid of some greatness, some are ";
		longestEvenLenthWord(str);
		System.out.println(9+9*9-9);

	}

	static Map<String, Integer> evenmap = new HashMap<>();
	static List<String> list = new ArrayList<>();

	public static void longestEvenLenthWord(String str) {
		String[] arr = str.split(" ");
		int max = 0;
		String finalWord = "";
		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			char[] ch = arr[i].toCharArray();
			int length = 0;
			for (int j = 0; j < ch.length; j++) {
				int val = ch[j];
				if (val >= 97 && val <= 122) {
					length++;
				}
			}
			if (length % 2 == 0) {
				list.add(String.valueOf(ch));
				evenmap.put(String.valueOf(ch), length);
				if (max < length) {
					max = length;
					finalWord = String.valueOf(ch);
				}
			}
		}
		// System.out.println("CollectionsCollectionsCollections"+Collections.max(list));
		System.out.println(evenmap);

		System.out.println("finalword "+finalWord);
	}
	
	static long countOvertake(int n, int[] a) {
		int overtakes = 0;
		for (int i = 0; i + 1 < n && i < n; i++) {
			if (a[i] > a[i + 1]) {
				overtakes++;
				a[i] = a[i] + a[i + 1];
				a[i + 1] = a[i] - a[i + 1];
				a[i] = a[i] - a[i + 1];
			}

		}
		return overtakes;
	}

}
