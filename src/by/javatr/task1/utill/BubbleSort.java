package by.javatr.task1.utill;

import by.javatr.task1.Array;

final class BubbleSort {

    public static void sort(Array array) {
        int[] value = array.getValue();
        bubbleSort(value);
    }

    private static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}
