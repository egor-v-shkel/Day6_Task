package by.javatr.task1.utill;

import by.javatr.scanner.DataScanner;
import by.javatr.task1.exceptions.ReadFileException;
import by.javatr.task1.valid.Validator;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

    private Arrays() {}

    public static void quickSort(Array array) {
        Validator.parameter(array);

        int[] arrayToSort = array.cloneValue();
        QuickSort.sort(arrayToSort);
    }

    public static void mergeSort(Array array) {
        Validator.parameter(array);

        int[] arrayToSort = array.cloneValue();
        MergeSort.sort(arrayToSort);
    }

    public static void bubbleSort(Array array) {
        Validator.parameter(array);

        int[] arrayToSort = array.cloneValue();
        BubbleSort.sort(arrayToSort);
    }

    public static int binarySearch(Array array, int element) {
        Validator.parameter(array);

        int[] value = array.value;
        int length = value.length;
        return BinarySearch.binarySearch(value, 0, length - 1, element);
    }


    public static int getMaxElement(Array array) {
        Validator.parameter(array);

        try {
            Array clone = array.clone();
            quickSort(clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        int lastIndex = array.length() - 1;
        if (lastIndex < 0 ) throw new IllegalArgumentException("Incorrect array.");
        return array.getElementAt(lastIndex);
    }

    public static int getMinElement(Array array) {
        Validator.parameter(array);

        try {
            Array clone = array.clone();
            quickSort(clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return array.getElementAt(0);
    }

    public static List<Integer> getFibList(Array array) {
        Validator.parameter(array);

        int[] srcArray = array.cloneValue();
        return Fibonacci.of(srcArray);
    }

    public static List<Integer> getPrimeList(Array array) {
        Validator.parameter(array);

        List<Integer> arrayList = new ArrayList<>();
        int[] value = array.cloneValue();

        for (int element :
                value) {
            if (PrimeNum.isPrime(element)) arrayList.add(element);
        }

        return arrayList;
    }

    public static List<Integer> getThreeDigitsNumRepetitionList(Array array) {
        Validator.parameter(array);

        List<Integer> intList = new ArrayList<>();
        int[] value = array.cloneValue();

        for (int element :
                value) {
            boolean hasNoRepetitions = DigitRepetition.hasNoRepetitions(element);
            boolean threeDigitNum = element > 99 && element < 1000;
            if (hasNoRepetitions && threeDigitNum) intList.add(element);
        }

        return intList;
    }

    public static Array getArrayFromConsole() {
        int[] ints = DataScanner.enterIntArrayFromConsole();

        return new Array(ints);
    }

    public static Array getArrayFromFile(String path) throws ReadFileException {
        Validator.parameter(path);

        List<Integer> list = DataScanner.enterIntArrayFromFile(path);
        return new Array(list);
    }

    public static Array getRandomArray(int size) {
        return getRandomArray(size, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static Array getRandomArray(int size, int min, int max) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) ((Math.random() * (((long) max - (long) min) + 1L)) + (long) min);
        }

        return new Array(arr);
    }
}
