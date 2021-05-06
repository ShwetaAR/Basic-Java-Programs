package programs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Test_ {

	public static void main(String[] args) {

		char[] ch = {};
		int start = 0;
		int len = 1;
		char[] newarr = charErrorChecking(ch, start, len);
		if (newarr == null) {
			System.out.println("null");
		} else {
			for (int i = start; i < len; i++) {
				System.out.println(newarr[i]);
			}
		}

		int result = reverseUsingNoDS(10000);
		reverse(12133);

		final String[] arr = { "Shwe", "Ram", "qqq" };
		arr[0] = "change";
		arr[3] = "we";
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}

	private static int  reverse(int number) {
		int sign = 1;
		if(number==0) return 0;
		if (number < 0) {
			sign = -1;
		}
		while (number != 0) {
			int result = number % 10;
			System.out.println(result);
			reverse(number / 10);
		}
		return 0;
	}

	private static int reverseUsingNoDS(int i) {
		char ch = (char) i;
		String input = String.valueOf(i);
		int k = 0;
		boolean isOutOfRange = false;
		boolean isNotANumber = false;
		Integer val = null;
		while (k >= 0) {
			try {

				char c = input.charAt(k);
				try {
					val = Integer.parseUnsignedInt(String.valueOf(c));
				} catch (NumberFormatException e) {
					isNotANumber = true;
				}
				if (isNotANumber) {
					k++;
					continue;
				}

			} catch (StringIndexOutOfBoundsException e) {
				isOutOfRange = true;
			}
			if (isOutOfRange)
				break;
			k++;
		}
		int len = 0;
		if (isNotANumber) {
			len = k - 1;
			while (len > 0) {
				System.out.print(input.charAt(len));
				len--;
			}
		} else {
			len = k - 1;
			while (len >= 0) {
				System.out.print(input.charAt(len));
				len--;
			}
		}

		return 0;
	}

	private static char[] charErrorChecking(char[] ch, int start, int len) {
		if (len < ch.length && len > 0 && start >= 0 && start < len) {
			char[] newchar = new char[len];
			for (int i = start; i < len; i++) {
				newchar[i] = ch[i];
			}
			return newchar;
		}
		return null;
	}
}
