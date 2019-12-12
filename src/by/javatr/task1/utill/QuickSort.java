package by.javatr.task1.utill;

import by.javatr.task1.Array;

final class QuickSort {

    static void sort(Array array) {
        doSort(array.getValue(), 0, array.length());
    }

    private static void doSort(int[] array, int low, int high) {
        if (array.length == 0) return;

        if (low >= high) return;

        int mid = low + (high - low) / 2;
        int pivot = array[mid];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) i++;

            while (array[j] > pivot) j--;

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) doSort(array, low, j);

        if (high > i) doSort(array, i, high);

    }
}
