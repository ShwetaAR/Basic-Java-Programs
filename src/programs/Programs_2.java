package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programs_2 {

	public static void main(String[] args) {

		int[] numbers = { 10, 45, 6, 34, 78, 0, 9 };
		find2ndLargestNumber(numbers);
		
		Stream.of(1,2,3,4,5,6,7,8,9).skip(5).forEach(p->System.out.println("hackerrank-->"+p));

		String str = "madam";
		removeDuplicateCharacterInaString(str);

		List<Integer> list = Arrays.asList(1, 6, 78, 9, 3);

		int length = list.size();
		System.out.println("sorted->");
		list.stream().sorted().forEach(p->System.out.println(p));
		
		System.out.println("eeee-->" + list.get(length - 3));
		list.stream().filter(p -> p % 2 != 0).forEach(p -> System.out.println(p));

		List<Integer> lis1 = list.stream().filter(p -> p % 2 != 0).map(x -> x).collect(Collectors.toList());
		System.out.println(lis1);
	}

	private static void removeDuplicateCharacterInaString(String str) {

		char[] chars = str.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
			charSet.add(c);
		}
		StringBuffer finalString = new StringBuffer();
		for (Character ch : charSet) {
			finalString.append(ch);
		}
		System.out.println("removeDuplicateCharacterInaString-->" + finalString);

	}

	private static void find2ndLargestNumber(int[] numbers) {
		int firstMax = 0, secondMax = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > firstMax) {
				secondMax = firstMax;
				firstMax = numbers[i];
			} else if (numbers[i] > secondMax && numbers[i] != firstMax) {
				secondMax = numbers[i];
			}

		}
		System.out.println("Max=" + firstMax);
		System.out.println("Second Max=" + secondMax);

	}

}
