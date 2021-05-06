package linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test1_1 {

	public static void main(String[] args) {

		String s1 = new String("Shweta");
		/*
		 * int incrment = 1;
		 * 
		 * for (int i = 0; i < 7; i++) { incrment = incrment + i;
		 * System.out.println(incrment); }
		 */
		int a = 2012012010;
		int b = 1210000000;
		swap(a, b);

		String str = "RAMQWE";
		String str1 = "MQWEAR";
		anagram(str, str1);

		String sentence = "My name is XYZ . XYZ  is a XYZ nice person";
		frequentOccurence(sentence);

		String reverseString = "My Name is Shweta Baberia";
		reverseRecursive(reverseString);
		reverse(reverseString);

	}

	private static void reverseRecursive(String reverseString) {
		if (reverseString == null || reverseString.length() <= 1)
			System.out.print(reverseString);
		else {
			System.out.print(reverseString.charAt(reverseString.length() - 1));
			reverse(reverseString.substring(0, reverseString.length() - 1));
		}

	}
	
	
	private static void reverse(String reverseString) {
		char[] str = reverseString.toCharArray();
		System.out.println();
		for(int i=1;i<str.length-1;i++) {
			System.out.print(str[str.length-i]);
		}

	}

	private static void frequentOccurence(String sentence) {
		String[] senArr = sentence.split(" ");
		HashMap<String, Integer> occurence = new HashMap<>();
		if (senArr.length > 0) {
			for (int i = 0; i < senArr.length; i++) {
				if (!occurence.containsKey(senArr[i]))
					occurence.put(senArr[i], 1);
				else
					occurence.put(senArr[i], occurence.get(senArr[i]) + 1);
			}
		}
		// Map<String, Integer> sorted = sortByValue(occurence);

		int max = 0;
		String key = "";
		Map<String, Integer> temp = new HashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : occurence.entrySet()) {
			temp.put(aa.getKey(), aa.getValue());
			if (aa.getValue() > max) {
				max = aa.getValue();
				key = aa.getKey();
			}
		}

		System.out.println(key + " have  " + max + " occurences");

	}

	private static Map<String, Integer> sortByValue(HashMap<String, Integer> occurence) {

		List<Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(occurence.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		Map<String, Integer> temp = new HashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}

		return temp;

	}

	private static void anagram(String str, String str1) {
		char[] ch = str.toCharArray();
		char[] ch1 = str1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		boolean isAnagram = false;
		if (ch.length == ch1.length) {
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == ch1[i]) {
					isAnagram = true;
				} else {
					isAnagram = false;
					break;
				}
			}
		} else
			isAnagram = false;

		if (isAnagram) {
			System.out.println("Is an Anagram");
		} else
			System.out.println("Is not an Anagram");

	}

	private static void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a=" + a + "\n b=" + b);
	}

}
