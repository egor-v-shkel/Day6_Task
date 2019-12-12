package by.javatr.task2.runner;

import by.javatr.task2.util.Sort;

import java.util.Arrays;

//Дан непрямоугольный целочисленный массив (jagged array). 
// Реализовать алгоритм "пузырьковой" сортировки, таким образом,
// чтобы была возможность упорядочить строки матрицы:
// в порядке возрастания (убывания) сумм элементов строк матрицы;
// в порядке возрастания (убывания) максимальных элементов строк матрицы;
// в порядке возрастания (убывания) минимальных элементов строк матрицы.
//Для сортировки методы класса Array не использовать! Основное требование избежать повтор кода.

public class Runner {

	public static void main(String[] args) {
		int[][] jaggedArray = {
			new int[] {11, 3, 54, 71, 9, 789, 112},
			new int[] {0, 26, 4, 65},
			new int[] {11, 22},
			new int[] {1,28, 2, 156, 15, 19, 896}
			};
		
		//упорядочить строки матрицы: в порядке возрастания сумм элементов строк матрицы;
		int[] arrayOfSums = Sort.bubbleSortSumsOfRowElementsDecr(jaggedArray);
		System.out.println(Arrays.toString(arrayOfSums));
		
		//упорядочить строки матрицы: в порядке убывания максимальных элементов строк матрицы;
		arrayOfSums = Sort.bubbleSortSumsOfRowElementsInc(jaggedArray);
		System.out.println(Arrays.toString(arrayOfSums));
		
		//упорядочить строки матрицы: в порядке возрастания  максимальных элементов строк матрицы;
		int[] arrayOfMaxElements = Sort.bubbleSortMaxElementsDecr(jaggedArray);
		System.out.println(Arrays.toString(arrayOfMaxElements));
		
		//упорядочить строки матрицы: в порядке убывания максимальных элементов строк матрицы;
		arrayOfMaxElements = Sort.bubbleSortMaxElementsInc(jaggedArray);
		System.out.println(Arrays.toString(arrayOfMaxElements));
		
		//упорядочить строки матрицы: в порядке возрастания минимальных элементов строк матрицы;
		int[] arrayOfMinElements = Sort.bubbleSortMinElementsDecr(jaggedArray);
		System.out.println(Arrays.toString(arrayOfMinElements));
				
		//упорядочить строки матрицы: в порядке убывания минимальных элементов строк матрицы;
		arrayOfMinElements = Sort.bubbleSortMinElementsInc(jaggedArray);
		System.out.println(Arrays.toString(arrayOfMinElements));
	}
}
