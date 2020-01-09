package by.javatr.task1.utill;

final class QuickSort {

    private QuickSort() {}

    static void sort(int[] array) {
        sortInRange(array, 0, array.length-1);
    }

    private static void sortInRange(int[] array, int low, int high) {
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

        if (low < j) sortInRange(array, low, j);

        if (high > i) sortInRange(array, i, high);

    }
}
