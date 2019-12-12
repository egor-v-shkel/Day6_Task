package by.javatr.task2.util;

public class Sort {

	public static void swap (int [] array, int a, int b){
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
	
	// ���������� ��������� array �� �����������
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
	
	// ���������� ��������� array �� ��������
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
	
	// ���������� ��������� jagged array, ������������ ������������� �� ����������� ����� ��������� ����� �������;
		public static int[]  bubbleSortSumsOfRowElementsDecr (int[][] jaggedArray) {
			int[] arrayOfSums = JaggedUtil.defineSumsOfElementsOfMatrixRows(jaggedArray);
			 Sort.bubbleSortDecr(arrayOfSums);
			 return arrayOfSums;
		}
	

		//���������� ��������� jagged array, ������������ ������������� �� ����������� ����� ��������� ����� �������;
		public static int[]  bubbleSortSumsOfRowElementsInc (int[][] jaggedArray) {
			int[] arrayOfSums = JaggedUtil.defineSumsOfElementsOfMatrixRows(jaggedArray);
			 Sort.bubbleSortInc(arrayOfSums);
			 return arrayOfSums;
		}
		
		//���������� ��������� jagged array, ������������ ������������� �� ����������� ������������ �������� ����� �������;
		public static int[]  bubbleSortMaxElementsDecr (int[][] jaggedArray) { 
			int[] arrayOfMaxElements = JaggedUtil.defineMaxElementsInRows(jaggedArray);
			Sort.bubbleSortDecr(arrayOfMaxElements);
			return arrayOfMaxElements;			
		}
				
		//���������� ��������� jagged array, ������������ ������������� �� �������� ������������ �������� ����� �������;
			public static int[]  bubbleSortMaxElementsInc (int[][] jaggedArray) { 
			int[] arrayOfMaxElements = JaggedUtil.defineMaxElementsInRows(jaggedArray);
			Sort.bubbleSortInc(arrayOfMaxElements);
			return arrayOfMaxElements;			
		}
			
			//���������� ��������� jagged array, ������������ ������������� �� ����������� ������������ �������� ����� �������;
			public static int[]  bubbleSortMinElementsDecr (int[][] jaggedArray) { 
				int[] arrayOfMinElements = JaggedUtil.defineMinElementsInRows(jaggedArray);
				Sort.bubbleSortDecr(arrayOfMinElements);
				return arrayOfMinElements;			
			}
					
			//���������� ��������� jagged array, ������������ ������������� �� ����������� ������������ �������� ����� �������;
				public static int[]  bubbleSortMinElementsInc (int[][] jaggedArray) { 
				int[] arrayOfMinElements = JaggedUtil.defineMinElementsInRows(jaggedArray);
				Sort.bubbleSortInc(arrayOfMinElements);
				return arrayOfMinElements;			
			}
		
	}

