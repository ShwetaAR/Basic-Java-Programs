package programs;

import java.util.ArrayList;

import java.util.Collection;

public class Sample {

	public static void main(String[] args) {

		String string = "GGGGrrrrrtGG";

		System.out.println(getConsecutiveOccurrenceOfChar(string.toLowerCase()));

		System.out.println(getConsecutiveOccurrenceOfChar(string.toLowerCase().toCharArray()));

	}

	// Example using char arrays

	private static Collection<String> getConsecutiveOccurrenceOfChar(char[] chars) {

		Collection<String> charCounts = new ArrayList<>();

		char current = chars[0];

		int count = 1;

		for (int i = 1; i < chars.length; i++) {

			char c = chars[i];

			if (current == c) {

				count++;

			} else {

				charCounts.add(current + " : " + count);

				count = 1;

				current = c;

			}

		}

		charCounts.add(current + " : " + count);

		return charCounts;

	}

	// Example using .charAt(int)

	private static Collection<String> getConsecutiveOccurrenceOfChar(String string) {

		Collection<String> charCounts = new ArrayList<>();

		char current = string.charAt(0);

		int count = 1;

		for (int i = 1; i < string.length(); i++) {

			char c = string.charAt(i);

			if (current == c) {

				count++;

			} else {

				charCounts.add(current + " : " + count);

				count = 1;

				current = c;

			}

		}

		charCounts.add(current + " : " + count);

		return charCounts;

	}

}
