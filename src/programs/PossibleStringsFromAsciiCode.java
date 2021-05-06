package programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * To find possible strings that could be created from a given ascii number
 * 
 * @author sbaberi1
 *
 */
public class PossibleStringsFromAsciiCode {

	public static void main(String[] args) {

		creatingCombination("2112");
	}

	private static void creatingCombination(String string) {

		char[] arr = string.toCharArray();
		int length = arr.length - 1;
		System.out.println(length);
		List<String> list = null;
		List<String> list_2 = null;
		List<String> list_3 = new LinkedList<>();
		Map<Integer, List<String>> map = new HashMap<>();
		int count = 1;
		int k = 0;
		/**
		 * adding all first elements
		 */
		while (k < arr.length) {
			list_3.add(String.valueOf((char) arr[k]));
			k++;
		}
		map.put(count, list_3);
		count++;
		int index = length;
		for (int i = index; i >= 0; i--) {
			list = new LinkedList<>();
			list_2 = new LinkedList<>();
			/**
			 * to add all starting element whose combination is not yet
			 * happening
			 */
			for (int j = 0; j <= index - 3; j++) {
				list.add(String.valueOf((char) arr[j]));
				list_2.add(String.valueOf((char) arr[j]));
			}
			/**
			 * starting from last 3 elementsa and making combination from them
			 * example right now for 2112 last 3 elements 112 ...combination (1)
			 * (12) and (11)(2) will get generated
			 */
			if (index >= 2) {
				list.add(String.valueOf((char) arr[i - 2]));
				list.add(String.valueOf((char) arr[i - 1]).concat(String.valueOf((char) arr[i])));

				list_2.add(String.valueOf((char) arr[i - 2]).concat(String.valueOf((char) arr[i - 1])));
				list_2.add(String.valueOf((char) arr[i]));
				/**
				 * if there's a element left after that 3 elemenst it gets added
				 * here example 2112 if element 211 is getting it's combination
				 * the last element 2 is left which has to be added
				 */
				if (arr.length - 1 > index) {
					for (int x = index + 1; x <= arr.length - 1; x++) {
						list.add(String.valueOf((char) arr[x]));
						list_2.add(String.valueOf((char) arr[x]));
					}
				}
				map.put(count, list);
				count++;
				map.put(count, list_2);
				count++;
				index--;
			}
			int lastLengthCombination = length - i;
			boolean addedToMap = false;
			if (lastLengthCombination >= 3) {

				map = makingComboFrom3Numbers(list, list_2, arr, i, addedToMap, map, count);

			}
		}

		Map<Integer, List<String>> comboOf2s = makingComboByKeeping2NumbersConstant(list, list_2, length, arr, count,
				map);
		removingDuplicates(map);

	}

	private static Map<Integer, List<String>> makingComboFrom3Numbers(List<String> list, List<String> list_2,
			char[] arr, int i, boolean addedToMap, Map<Integer, List<String>> map, int count) {
		list.add(String.valueOf((char) arr[i]));
		list.add(String.valueOf((char) arr[i + 1]));
		list.add(String.valueOf((char) arr[i + 2]).concat(String.valueOf((char) arr[i + 3])));

		list_2.add(String.valueOf((char) arr[i]));
		list_2.add(String.valueOf((char) arr[i + 1]).concat(String.valueOf((char) arr[i + 2])));
		list_2.add(String.valueOf((char) arr[i + 3]));
		map.put(count, list);
		count++;
		return map;
	}

	private static Map<Integer, List<String>> makingComboByKeeping2NumbersConstant(List<String> list,
			List<String> list_2, int length, char[] arr, int count, Map<Integer, List<String>> map) {

		list = new LinkedList();
		list_2 = new LinkedList();
		for (int p = 0; p < arr.length; p = p + 2) {
			if (p + 1 < arr.length) {
				list.add(String.valueOf((char) arr[p]).concat(String.valueOf((char) arr[p + 1])));

				int endStringLength = length - (p + 1);
				if (endStringLength >= 3) {
					list_2.add(String.valueOf((char) arr[p]).concat(String.valueOf((char) arr[p + 1])));
					list_2.add(String.valueOf((char) arr[p + 2]));
					list_2.add(String.valueOf((char) arr[p + 3]).concat(String.valueOf((char) arr[p + 4])));

				}
			} else
				list.add(String.valueOf((char) arr[p]));
		}
		if (!list.isEmpty() && list != null)
			map.put(count, list);
		count++;
		if (!list_2.isEmpty() && list != null)
			map.put(count, list_2);
		count++;
		return map;
	}

	private static void removingDuplicates(Map<Integer, List<String>> map) {
		Set<List<String>> values = new HashSet<>();
		Set<List<String>> dupValues = new HashSet<List<String>>();
		for (Entry<Integer, List<String>> lists : map.entrySet()) {
			List<String> value = lists.getValue();
			if (!values.add(value)) {
				dupValues.add(value);
			}
		}

		Map<Integer, List<String>> remainingValueMap = new HashMap<>();
		int len = values.size();
		System.out.println("len-->" + len);
		Iterator<List<String>> it = values.iterator();
		int y = 1;
		while (it.hasNext()) {
			remainingValueMap.put(y, it.next());
			y++;
		}

		List<StringBuilder> getAllStringFromGivenAscii = new LinkedList<>();
		for (Entry<Integer, List<String>> getCharString : remainingValueMap.entrySet()) {
			System.out.println("************STRING value *************");

			List<String> list = getCharString.getValue();
			System.out.println("************" + list + "************");
			StringBuilder st = new StringBuilder();
			boolean validString = false;
			for (String s : list) {

				char[] ch = s.toCharArray();

				if (Integer.parseInt(String.valueOf(s)) <= 26) {
					validString = true;
					int num = Integer.parseInt(String.valueOf(s));
					System.out.printf("num " + s + "=" + (char) (64 + num));
					System.out.println();
					st.append(String.valueOf((char) (64 + num)));
				} else {
					validString = false;
					break;
				}
			}
			if (validString) {
				getAllStringFromGivenAscii.add(st);
			}

			System.out.println("StringBuilder valid strnin-->" + getAllStringFromGivenAscii);

		}
		System.out.println(map);
		System.out.println("After removing duplication");
		System.out.println(remainingValueMap);

	}

}
