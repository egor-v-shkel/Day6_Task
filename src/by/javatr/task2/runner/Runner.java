package by.javatr.task2.runner;

import by.javatr.task2.function.JaggedFunction;
import by.javatr.task2.function.impl.*;
import by.javatr.task2.util.BubbleSort;
import by.javatr.task2.util.JaggedService;

public class Runner {

	public static void main(String[] args) {
		int[][] jaggedArray = {
				new int[] {0, 2, 4},
				new int[] {-1, -3, -5},
				new int[] {1, 3, 5},
				new int[] {8, 2, 6, 1024, 1999},
				new int[] {256, 128, 512, 999}
		};

		sortAndPrint(jaggedArray, new Max());

		sortAndPrint(jaggedArray, new Min());

		sortAndPrint(jaggedArray, new Summ());
	}

	private static void sortAndPrint(int[][] jaggedArray, JaggedFunction function) {
		String x = "\n+++++++++++++++++++++++\n";
		String s = "=======================";

		System.out.println(function.getClass().getName());

		System.out.println(x+"ASCENDING"+x);
		BubbleSort.sort(jaggedArray, function, new Ascending());
		String jaggedStr = JaggedService.toString(jaggedArray);
		System.out.println(jaggedStr);

		System.out.println(x+"DESCENDING"+x);
		BubbleSort.sort(jaggedArray, function, new Descending());
		jaggedStr = JaggedService.toString(jaggedArray);
		System.out.println(jaggedStr);

		System.out.println(s);
	}
}
