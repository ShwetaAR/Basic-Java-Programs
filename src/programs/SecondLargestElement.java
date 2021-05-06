package programs;

public class SecondLargestElement {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4};
		System.out.println(evalualte(arr));

	}

	private static int evalualte(int[] arr) {

		int max = 0;
		int secondMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				secondMax = max;
				max = arr[i];
			} else if (secondMax < arr[i] && arr[i] != max)
				secondMax = arr[i];
		}
		if (secondMax != 0) {
			return secondMax;
		} else

			return -1;
	}

}
