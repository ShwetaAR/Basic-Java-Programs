package programs_2;

public class AsciiNumbersConvertedToDifferrentStrings {
	private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	// Function to find all possible combinations of words formed
	// by replacing given positive numbers with the corresponding
	// character of the English alphabet
	public static void recur(int[] digits, int i, String str) {
		// base case: all digits are processed in the current configuration
		if (i == digits.length) {
			// print the string
			System.out.println(str);
			return;
		}

		int sum = 0;

		// process the next two digits (i'th and (i+1)'th)
		System.out.println(Integer.min(i + 1, digits.length - 1));
		for (int j = i; j <= Integer.min(i + 1, digits.length - 1); j++) {
			sum = (sum * 10) + digits[j];

			// if a valid char can be formed by taking one or both digits,
			// append it to the output and recur for the remaining digits
			if (sum > 0 && sum <= 26) {
				recur(digits, j + 1, str + alphabet.charAt(sum - 1));
			}
		}
	}

	public static void main(String[] args) {
		int[] digits = { 1, 1,2, 2 };

		String str = "";
		recur(digits, 0, str);
	}
}
