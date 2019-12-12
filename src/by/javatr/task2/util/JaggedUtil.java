package by.javatr.task2.util;

public class JaggedUtil {

	public static int[] defineSumsOfElementsOfMatrixRows(int[][] jaggedArray)  {
		int lengthJaggedArr = jaggedArray.length;
		int[] arrayOfSums = new int [lengthJaggedArr];

		for (int i=0; i < lengthJaggedArr; i++){
			for (int j = 0 ; j < jaggedArray[i].length ; j++) {
				arrayOfSums[i] += jaggedArray[i][j];
			}
		}
		return arrayOfSums;	
	}

	public static int[] defineMaxElementsInRows(int[][] jaggedArray)  {
		int[] arrayOfMaxElements = new int [jaggedArray.length];
		for (int i=0; i < jaggedArray.length; i++){
			int maxTemp = jaggedArray[i][0];
			for (int j = 0 ; j < jaggedArray[i].length ; j++) {
				if (jaggedArray[i][j] > jaggedArray[i][0]) { 
					maxTemp = jaggedArray[i][j]; }
			}
			arrayOfMaxElements [i] = maxTemp;
		}
		return arrayOfMaxElements;	
	}

	public static int[] defineMinElementsInRows(int[][] jaggedArray)  {
		int[] arrayOfMinElements = new int [jaggedArray.length];	
		for (int i=0; i < jaggedArray.length; i++){
			int minTemp = jaggedArray[i][0];
			for (int j = 0 ; j < jaggedArray[i].length ; j++) {
				if (jaggedArray[i][j] < minTemp) { 
					minTemp = jaggedArray[i][j]; }
			}
			arrayOfMinElements [i] = minTemp;
		}
		return arrayOfMinElements;	
	}

}
