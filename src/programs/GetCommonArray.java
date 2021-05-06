package programs;

public class GetCommonArray {

	public static void main(String[] args) {
		int[] a1 = { 1, 8, 3, 2, 6 };
		int[] a2 = { 2, 6, 1, 9 };
		int[] newarr = null;
		newarr = evaluateCommonArray(a1, a2, newarr);

		for (int l = 0; l < newarr.length; l++)
			System.out.print(newarr[l]);
	}

	private static int[] evaluateCommonArray(int[] a1, int[] a2, int[] newarr) {
		int k = 0;
		if (a1.length > a2.length)
			newarr = new int[a2.length];
		else
			newarr = new int[a1.length];
		for (int i = 0; i < a1.length; i++) {
			int count = 0;
			for (int j = 0; j < a2.length; j++) {
				if (a1[i] == a2[j]) {
					newarr[k] = a1[i];
					k++;
				}
			}

		}
		int[] temparr = new int[k];
		for (int i = 0; i < k; i++)
			temparr[i] = newarr[i];

		return temparr;
	}

}
