package by.javatr.task2.runner;

import by.javatr.task2.util.Condition;
import by.javatr.task2.util.BubbleSort;
import by.javatr.task2.util.JaggedUtil;

import static by.javatr.task2.util.BubbleSort.Order.ASCENDING;
import static by.javatr.task2.util.BubbleSort.Order.DESCENDING;

public class Runner {

	public static void main(String[] args) {
		int[][] jaggedArray = {
				new int[] {0, 2, 4},
				new int[] {-1, -3, -5},
				new int[] {1, 3, 5},
				new int[] {8, 2, 6, 999, 1024},
				new int[] {256, 128, 512, 1999}
		};

		sortAndPrint(jaggedArray, Condition.MAX_ELEM);

		sortAndPrint(jaggedArray, Condition.MIN_ELEM);

		sortAndPrint(jaggedArray, Condition.ELEMENTS_SUM);
	}

	private static void sortAndPrint(int[][] jaggedArray, Condition minElem) {
		String x = "\n+++++++++++++++++++++++\n";
		String s = "=======================";

		System.out.println(Condition.MAX_ELEM);

		System.out.println(x+ASCENDING+x);
		BubbleSort.sort(jaggedArray, minElem, ASCENDING );
		String jaggedStr = JaggedUtil.toString(jaggedArray);
		System.out.println(jaggedStr);

		System.out.println(x+DESCENDING+x);
		BubbleSort.sort(jaggedArray, minElem, DESCENDING );
		jaggedStr = JaggedUtil.toString(jaggedArray);
		System.out.println(jaggedStr);

		System.out.println(s);
	}
}
