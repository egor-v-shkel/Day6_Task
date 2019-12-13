package by.javatr.task2.util;

public class BubbleSort {

    public static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    public static void bubbleSortDecr(int[] array) {
        if (array == null || array.length == 0 || array.length == 1) return;
        else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        swap(array, j, j + 1);
                    }
                }
            }
        }
    }

    public static void bubbleSortInc(int[] array) {
        if (array == null || array.length == 0 || array.length == 1) return;
        else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] < array[j + 1]) {
                        swap(array, j, j + 1);
                    }
                }
            }
        }
    }

    public static int[] sumsOfRowElementsAsc(int[][] jaggedArray) {
        int[] arrayOfSums = JaggedUtil.defineSumsOfElementsOfMatrixRows(jaggedArray);
        BubbleSort.bubbleSortDecr(arrayOfSums);
        return arrayOfSums;
    }

    public static int[] sumsOfRowElementsDesc(int[][] jaggedArray) {
        int[] arrayOfSums = JaggedUtil.defineSumsOfElementsOfMatrixRows(jaggedArray);
        BubbleSort.bubbleSortInc(arrayOfSums);
        return arrayOfSums;
    }

    public static int[] maxElementsAsc(int[][] jaggedArray) {
        int[] arrayOfMaxElements = JaggedUtil.defineMaxElementsInRows(jaggedArray);
        BubbleSort.bubbleSortDecr(arrayOfMaxElements);
        return arrayOfMaxElements;
    }

    public static int[] maxElementsDesc(int[][] jaggedArray) {
        int[] arrayOfMaxElements = JaggedUtil.defineMaxElementsInRows(jaggedArray);
        BubbleSort.bubbleSortInc(arrayOfMaxElements);
        return arrayOfMaxElements;
    }

    public static int[] minElementsAsc(int[][] jaggedArray) {
        int[] arrayOfMinElements = JaggedUtil.defineMinElementsInRows(jaggedArray);
        BubbleSort.bubbleSortDecr(arrayOfMinElements);
        return arrayOfMinElements;
    }

    public static int[] minElementsDesc(int[][] jaggedArray) {
        int[] arrayOfMinElements = JaggedUtil.defineMinElementsInRows(jaggedArray);
        BubbleSort.bubbleSortInc(arrayOfMinElements);
        return arrayOfMinElements;
    }
}

