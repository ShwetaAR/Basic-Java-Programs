package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ReverseStringKeepingSpecialCharacter {
	public static void main(String[] args) {
		reverse("ram's");

	}

	private static void reverse(String string) {
		string.toLowerCase();
		System.out.print("INPUT: ");
		System.out.println(string);
		char[] str = string.toCharArray();
		int k = 0;
		char[] newA = new char[str.length];
		int length = string.length() - 1;
		int leftIndex = 0;
		while (leftIndex < length) {
			int right = (int) str[length];
			int left = (int) str[leftIndex];
			// System.out.println(ch);
			if (!(right > 96 && right < 123)) {
				// newA[k] = str[length];
				length--;
			} else if (!(left > 96 && left < 123)) {
				// newA[k] = str[length];
				leftIndex++;
			} else {
				char temp = str[length];
				str[length] = str[leftIndex];
				str[leftIndex] = temp;
				leftIndex++;
				length--;

			}

		}
		System.out.print("REVERSE: ");
		for (

				int i = 0; i < string.length(); i++)
			System.out.print(str[i]);

	}
}
