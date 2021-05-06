package programs;

public class FinalKeyword {

	public static void main(String[] args) {
		int i = 10;
		method(10);
		System.out.println(i);
	}

	private static void  method(int i) {
		i = i+1;
		//return i;
	}

}
