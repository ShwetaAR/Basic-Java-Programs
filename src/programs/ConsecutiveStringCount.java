package programs;

import java.util.ArrayList;
import java.util.Collection;

public class ConsecutiveStringCount {

	public static void main(String[] args) {

		String str = "GGGGrrrrrRtR";
		findCount(str);
	}

	private static void findCount(String str) {
		char[] strArr = str.toCharArray();
		
		Collection<String> charCounts = new ArrayList<>();
		int length = strArr.length - 1;
		int count = 0;
		for (int i = 0; i <= length; i++) {
			count = 1;
			while (i + 1 <= length && String.valueOf(strArr[i]).equalsIgnoreCase(String.valueOf(strArr[i + 1]))) {
				i++;
				count++;
				// st=st.concat(String.valueOf(count)+strArr[i]);
			}
			charCounts.add(strArr[i] + ": " + count);

		}

		// for(int i=0)
		System.out.println(charCounts);

	}

}
