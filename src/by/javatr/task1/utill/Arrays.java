package by.javatr.task1.utill;

import by.javatr.scanner.DataScanner;
import by.javatr.task1.Exceptions.ReadFileException;
import by.javatr.task1.valid.ArraysValidator;
import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arrays {

    private Arrays() {
    }

    public static void quickSort(Array array) {
        ArraysValidator.validateNotNull(array);

        int[] arrayToSort = array.getValue();
        QuickSort.sort(arrayToSort);
    }

    public static void mergeSort(Array array) {
        ArraysValidator.validateNotNull(array);

        int[] arrayToSort = array.getValue();
        MergeSort.sort(arrayToSort);
    }

    public static void bubbleSort(Array array) {
        ArraysValidator.validateNotNull(array);

        int[] arrayToSort = array.getValue();
        BubbleSort.sort(arrayToSort);
    }

    public static int binarySearch(Array array, int element) {
        ArraysValidator.validateNotNull(array);

        int[] value = array.value;
        int length = value.length;
        return BinarySearch.binarySearch(value, 0, length - 1, element);
    }

    public static int getMaxElement(Array array) {
        ArraysValidator.validateNotNull(array);

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
        ArraysValidator.validateNotNull(array);

        try {
            Array clone = array.clone();
            quickSort(clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return array.getElementAt(0);
    }

    public static List<Integer> getFibList(Array array) {
        ArraysValidator.validateNotNull(array);

        int[] srcArray = array.getValue();
        return Fibonacci.of(srcArray);
    }

    public static List<Integer> getPrimeList(Array array) {
        ArraysValidator.validateNotNull(array);

        List<Integer> arrayList = new ArrayList<>();
        int[] value = array.getValue();

        for (int element :
                value) {
            if (PrimeNum.isPrime(element)) arrayList.add(element);
        }

        return arrayList;
    }

    public static List<Integer> getThreeDigitsNumRepetitionList(Array array) {
        ArraysValidator.validateNotNull(array);

        List<Integer> intList = new ArrayList<>();
        int[] value = array.getValue();

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
        ArraysValidator.validateNotNull(path);

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
