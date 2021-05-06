package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Matrix {

	public static void main(String[] args) {
		List<List<Integer>> matrix = new ArrayList<>();
		List<Integer> list1 = Arrays.asList(1, 3, 4);
		List<Integer> list2 = Arrays.asList(5, 2, 9);
		List<Integer> list3 = Arrays.asList(8, 7, 6);
		matrix.add(list1);
		matrix.add(list2);
		matrix.add(list3);
		List<Integer> rowMaxArr = new LinkedList<Integer>();
		List<Integer> rowMinArr= new LinkedList<>();
		for (List<Integer> rows : matrix) {
			System.out.println(rows);
			
			int rowsMaxValue = Collections.max(rows);
			int rowsMinValue = Collections.min(rows);
			System.out.println("rowMaxValue" + rowsMaxValue);
			System.out.println("rowMMin" + rowsMinValue);

			int maxcount = 0;
			int mincount = 0;
			for (int i = 0; i < rows.size(); i++) {
				if (rows.get(i) == rowsMaxValue) {
					maxcount++;
				}
				if (rows.get(i) == rowsMinValue) {
					mincount++;
				}
			}
			if (mincount >= 2 || maxcount >= 2)
				;
			// return -1;
			else {
				rowMaxArr.add(rowsMaxValue);
				rowMinArr.add(rowsMinValue);
			}
			
			//for()

		}
		//System.out.println(rowMaxArr);
		//System.out.println(rowMinArr);

	}

}
