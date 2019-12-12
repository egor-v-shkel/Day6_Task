package by.javatr.task1.utill;

import by.javatr.task1.Array;

final class MergeSort {

    static void sort(Array arr) {
        int[] value = arr.getValue();
        ArrayValidator.validateNotNull(value);
        doSort(value);
    }

    private static int[] doSort(int[] arrayA) {
        if (arrayA.length < 2) {
            return arrayA;
        }

        int[] arrayB = new int[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        int[] arrayC = new int[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        arrayB = doSort(arrayB);
        arrayC = doSort(arrayC);

        return mergeArray(arrayB, arrayC);
    }

    private static int[] mergeArray(int[] arrayA, int[] arrayB) {

        int[] arrayC = new int[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length) {
                arrayC[i] = arrayB[i - positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayA[i - positionA];
                positionA++;
            } else if (arrayA[i - positionA] < arrayB[i - positionB]) {
                arrayC[i] = arrayA[i - positionA];
                positionB++;
            } else {
                arrayC[i] = arrayB[i - positionB];
                positionA++;
            }
        }
        return arrayC;

    }
}