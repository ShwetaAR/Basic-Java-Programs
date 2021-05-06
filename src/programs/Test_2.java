package programs;

public class Test_2 {

	public static void main(String[] args) {
		collapseString("GGGGrrtG");
		/*
		 * int i = 010; int j = 07;
		 * 
		 * System.out.println(i); System.out.println(j);
		 * 
		 * int mask = 0x000F; int value = 0x2222;
		 * System.out.printf("binary sum "); System.out.println(value & mask);
		 * 
		 * Float f1 = new Float("3.0"); int x = f1.intValue();
		 * System.out.println("nt =" + x); byte b = f1.byteValue();
		 * System.out.println("b =" + b); double c = f1.doubleValue();
		 * System.out.println("c =" + c); System.out.println(x + b + c);
		 */
	}

	public static String collapseString(String inputString) {
		String result = "";
		
		// char[] inputArr = inputString.toCharArray();
		if (inputString.isEmpty())
			return result;
		else {
			char[] inputArr = inputString.toCharArray();

			for (int i = 0; i < inputArr.length; i++) {
				int count = 1;
				while(i + 1 < inputArr.length && inputArr[i] == inputArr[i + 1]) {
					count++;
					i++;

				}
				System.out.println("" + inputArr[i] + ": " + count);
			}
			return result;
		}

	}

	public static char[] shifitngArray(char[] inputArr, int index) {
		char[] newArr = new char[(inputArr.length) * 2];
		int count = 1;
		for (int i = 0, k = 0; i < inputArr.length; i++) {
			char ch = inputArr[i];
			char chNext = inputArr[i + 1];
			if (ch != ' ') {
				if (inputArr[i] == inputArr[i + 1]) {
					count++;

				}
			} else {
				char value_char = Integer.toString(count).charAt(0);
				newArr[k] = value_char;
				newArr[k + 1] = inputArr[i];
			}
			// inputArr=newArr;
		}
		return inputArr;

	}

}
