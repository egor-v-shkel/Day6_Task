package by.javatr.task2.util;

import by.javatr.task2.Validators.BubbleSortValidator;
import by.javatr.task2.function.JaggedBiFunction;
import by.javatr.task2.function.JaggedFunction;
import by.javatr.task2.function.impl.Ascending;
import by.javatr.task2.function.impl.Summ;

public class BubbleSort {

    //default method
    public static void sort(int[][] array) {
        sort(array, new Summ(), new Ascending());
    }

    public static void sort(int[][] array, JaggedFunction sortCondition, JaggedBiFunction order) {
        if (array == null || sortCondition == null || order == null)
            throw new IllegalArgumentException("Can't pass null as a parameter.");

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                int result1 = sortCondition.apply(array[j]);
                int result2 = sortCondition.apply(array[j + 1]);

                if (order.apply(result1, result2)) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[][] array, int a, int b) {
        int[] tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}

