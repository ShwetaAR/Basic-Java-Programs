package programs;

public class POE {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 10, 3, 4 };
		int poe = evaluatePointOfEquiliberium(arr);
		System.out.println("POe**********" + poe);
	}

	private static int evaluatePointOfEquiliberium(int[] arr) {
		int poe = 1;
		if (arr.length > 2) {

			boolean poeExist = false;
			for (int i = 0; i < arr.length; i++) {
				int sumFirst = sumOfStartingIndex(arr, poe);
				int sumLast = sumOfLastIndex(arr, poe);
				System.out.println("Starting sum : " + sumFirst + "  Last Indexes Sum :" + sumLast);
				if (sumFirst == sumLast) {
					poeExist = true;
					if (poe != 0)
						return poe;
					else
						return -1;

				}
				poe++;

			}
			if (!poeExist) {
				return -1;
			}

		} else

			return -1;
		return poe;
	}

	private static int sumOfLastIndex(int[] arr, int poe) {

		int sum = 0;
		if (poe + 1 < arr.length) {
			for (int i = poe + 1; i < arr.length; i++) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

	private static int sumOfStartingIndex(int[] arr, int poe) {
		int sum = 0;
		for (int i = 0; i < poe; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

}
