package programs;

import java.util.Arrays;

public class AnagramToPalindrome {
	Object message(){
		return"hello";
	}

	public static void main(String[] args) {
		//boolean isPalindrome = ifAnagramToPalindrom("ccaaabbbb");// cabbabbac
																	// pallindrome
		//System.out.println("Is it a pallindrom: " +k isPalindrome);
		//System.out.println(canFormPalindrome("ccaaabmbbb"));
		System.out.println("nifty" instanceof String);
		System.out.println(new AnagramToPalindrome().message());

	}
	
	 static boolean canFormPalindrome(String str)
	    {
	        // Create a count array and initialize
	        // all values as 0
	        int[] count = new int[256];
	 
	        // For each character in input strings,
	        // increment count in the corresponding
	        // count array
	        for (int i = 0; i < str.length(); i++){
	            count[str.charAt(i)]++;
	            System.out.println(count[str.charAt(i)]);
	        }
	 
	        // Count odd occurring characters
	        int odd = 0;
	        for (int i = 0; i < 256; i++) {
	            if ((count[i] & 1) != 0)
	                odd++;
	 
	            if (odd > 1)
	                return false;
	        }
	 
	        // Return true if odd count is 0 or 1,
	        return true;
	    }
	 
	
	
	

	private static boolean ifAnagramToPalindrom(String str) {
		char ch[] = str.toCharArray();
		char oddChan;// aaaccbbbb
		Arrays.sort(ch);
		int count = 0;
		int oddcount = 0;

		int[] count_ = new int[256];

		// For each character in input strings,
		// increment count in the corresponding
		// count array
		for (int i = 0; i < str.length(); i++) {
			count_['a']++;
		}

		if (!(((ch.length) % 2) == 0)) {
			for (int i = 0; i < ch.length; i++) {
				System.out.println("ch[i]= " + ch[i] + "  ch[i+1]= " + ch[i + 1]);
				if (ch[i] == ch[i + 1] && (i + 1) < ch.length) {
					count++;
					continue;
				} else
					oddcount++;
			}
			if (oddcount > 1) {
				return false;
			} else
				return true;

		} else
			return false;

	}

}
