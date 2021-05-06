package programs_2;

import java.util.concurrent.ConcurrentHashMap;

public class PermutationOfString {

	public static void main(String[] args) {
		String input = "ABC";

		permutation(input, 0, input.length());
		ConcurrentHashMap<Integer, Integer> c = new ConcurrentHashMap<>();

	}

	private static void permutation(String input, int start, int end) {

		for (int i = start; i < end; i++) {

			input = swap(input, start, i);
			permutation(input, start + 1, end);
			// Backtracking and swapping the characters again.
			input = swap(input, start, i);
			System.out.println(input);

		}

	}

	private static String swap(String input, int start, int end) {

		char[] ch = input.toCharArray();
		char temp = ch[start];
		ch[start] = ch[end];
		ch[end] = temp;
		return String.valueOf(ch);

	}

}
