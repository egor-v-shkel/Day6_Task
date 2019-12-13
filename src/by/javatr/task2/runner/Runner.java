package by.javatr.task2.runner;

import by.javatr.task2.util.BubbleSort;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		int[][] jaggedArray = {
			new int[] {1},
			new int[] {3, 2, 1},
			new int[] {99, 66, 102, 256, 0, 999, 12},
			new int[] {2, 4, 6, 8, 10 ,12}
			};
		
		int[] sums = BubbleSort.sumsOfRowElementsAsc(jaggedArray);
		System.out.println(Arrays.toString(sums));
		
		sums = BubbleSort.sumsOfRowElementsDesc(jaggedArray);
		System.out.println(Arrays.toString(sums));
		
		int[] maxElements = BubbleSort.maxElementsAsc(jaggedArray);
		System.out.println(Arrays.toString(maxElements));
		
		maxElements = BubbleSort.maxElementsDesc(jaggedArray);
		System.out.println(Arrays.toString(maxElements));
		
		int[] arrayOfMinElements = BubbleSort.minElementsAsc(jaggedArray);
		System.out.println(Arrays.toString(arrayOfMinElements));
				
		arrayOfMinElements = BubbleSort.minElementsDesc(jaggedArray);
		System.out.println(Arrays.toString(arrayOfMinElements));
	}
}
