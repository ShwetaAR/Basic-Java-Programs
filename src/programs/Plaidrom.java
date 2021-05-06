package programs;

import java.util.LinkedList;
import java.util.List;
/**
 * Select sname from Stundent where sid IN (select sid from Marks where MAX(marks)));
 * @author sbaberi1
 *
 */
public class Plaidrom {

	public static void main(String[] args) {

		substringPalidrome("ABABCAACBP");
	}

	private static void substringPalidrome(String string) {
		List<String> listOfPlaidrom = new LinkedList<String>();
		char[] strArr = string.toCharArray();
		int k = 0;
		while (k < strArr.length) {
			for (int j = k + 1; j < strArr.length; j++) {
				if (strArr[k] == strArr[j] ) {
					findIfPalindrome(string.substring(k, j + 1), listOfPlaidrom);
				}
			}
			k++;
		}
		System.out.println(listOfPlaidrom);

	}

	private static void findIfPalindrome(String substring, List<String> listOfPlaidrom) {
		char[] subArr = substring.toCharArray();
		int i = 0;
		int length = subArr.length;
		boolean isPalindrome = false;
		while (i < length) {
			if (subArr[i] == subArr[length - 1]) {
				i++;
				length--;
				isPalindrome = true;

			} else {
				isPalindrome = false;
				i++;
				break;
			}
		}
		if (isPalindrome) {
			listOfPlaidrom.add(substring);
		}
	}

}
