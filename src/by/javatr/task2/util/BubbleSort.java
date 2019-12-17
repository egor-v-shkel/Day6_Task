package by.javatr.task2.util;

import by.javatr.task2.Validators.BubbleSortValidator;

public class BubbleSort {

    public enum Order{ASCENDING, DESCENDING}

    //default method
    public static void sort(int[][] array){
        sort(array, Condition.ELEMENTS_SUM, Order.ASCENDING);
    }

    public static void sort(int[][] array, Condition sortCondition, Order order) {
        BubbleSortValidator.validateNotNull(array);

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (order == Order.ASCENDING) {
                    if (sortCondition.apply(array[j]) > sortCondition.apply(array[j + 1])) {
                        swap(array, j, j + 1);
                    }
                } else {
                    if (sortCondition.apply(array[j]) < sortCondition.apply(array[j + 1])) {
                        swap(array, j, j + 1);
                    }
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

