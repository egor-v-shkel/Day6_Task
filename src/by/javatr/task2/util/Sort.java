package by.javatr.task2.util;

public class Sort {

	public static void swap (int [] array, int a, int b){
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
	
	// Сортировка пузырьком array по возрастанию
	public static void bubbleSortDecr(int [] array){
		if (array == null || array.length == 0 || array.length == 1) return;
		else{
			for(int i = 0;  i <  array.length; i++){
				for(int j = 0; j <  array.length-i-1; j++){
					if(array[j] > array[j + 1]){
						swap(array, j, j + 1);}
				}
			}
		}
	}
	
	// Сортировка пузырьком array по убыванию
	public static void bubbleSortInc(int [] array){
		if (array == null || array.length == 0 || array.length == 1) return;
		else{
			for(int i = 0;  i <  array.length; i++){
				for(int j = 0; j <  array.length-i-1; j++){
					if(array[j] < array[j + 1]){
						swap(array, j, j + 1);}
				}
			}
		}
	}
	
	// Сортировка пузырьком jagged array, возвращающая упорядоченные по возрастанию суммы элементов строк матрицы;
		public static int[]  bubbleSortSumsOfRowElementsDecr (int[][] jaggedArray) {
			int[] arrayOfSums = JaggedUtil.defineSumsOfElementsOfMatrixRows(jaggedArray);
			 Sort.bubbleSortDecr(arrayOfSums);
			 return arrayOfSums;
		}
	

		//Сортировка пузырьком jagged array, возвращающая упорядоченные по возрастанию суммы элементов строк матрицы;
		public static int[]  bubbleSortSumsOfRowElementsInc (int[][] jaggedArray) {
			int[] arrayOfSums = JaggedUtil.defineSumsOfElementsOfMatrixRows(jaggedArray);
			 Sort.bubbleSortInc(arrayOfSums);
			 return arrayOfSums;
		}
		
		//Сортировка пузырьком jagged array, возвращающая упорядоченные по возрастанию максимальные элементы строк матрицы;
		public static int[]  bubbleSortMaxElementsDecr (int[][] jaggedArray) { 
			int[] arrayOfMaxElements = JaggedUtil.defineMaxElementsInRows(jaggedArray);
			Sort.bubbleSortDecr(arrayOfMaxElements);
			return arrayOfMaxElements;			
		}
				
		//Сортировка пузырьком jagged array, возвращающая упорядоченные по убыванию максимальные элементы строк матрицы;
			public static int[]  bubbleSortMaxElementsInc (int[][] jaggedArray) { 
			int[] arrayOfMaxElements = JaggedUtil.defineMaxElementsInRows(jaggedArray);
			Sort.bubbleSortInc(arrayOfMaxElements);
			return arrayOfMaxElements;			
		}
			
			//Сортировка пузырьком jagged array, возвращающая упорядоченные по возрастанию максимальные элементы строк матрицы;
			public static int[]  bubbleSortMinElementsDecr (int[][] jaggedArray) { 
				int[] arrayOfMinElements = JaggedUtil.defineMinElementsInRows(jaggedArray);
				Sort.bubbleSortDecr(arrayOfMinElements);
				return arrayOfMinElements;			
			}
					
			//Сортировка пузырьком jagged array, возвращающая упорядоченные по возрастанию максимальные элементы строк матрицы;
				public static int[]  bubbleSortMinElementsInc (int[][] jaggedArray) { 
				int[] arrayOfMinElements = JaggedUtil.defineMinElementsInRows(jaggedArray);
				Sort.bubbleSortInc(arrayOfMinElements);
				return arrayOfMinElements;			
			}
		
	}

