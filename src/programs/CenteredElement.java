package programs;

public class CenteredElement {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 4, 1 };
		int result = findCenterdElement(arr);
		if (result == 1)
			System.out.println("It's Centered Array");
		else
			System.out.println("It's Not Centered Array");

	}

	private static int findCenterdElement(int[] a) {

		if (a == null || a.length % 2 == 0)
			return 0;
		int midIndex = a.length / 2;
		int middleItem = a[midIndex];
		for (int i = 0; i < a.length; i++) {
			if (i != midIndex && middleItem >= a[i])
				return 0;
		}
		return 1;

	}

}
