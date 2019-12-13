package by.javatr.task1.utill;

import by.javatr.scanner.DataScanner;
import by.javatr.task1.Array;
import by.javatr.task1.Exceptions.ReadFileException;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

    private Arrays() {
    }

    public static void quickSort(Array array) {
        int[] arrayToSort = array.getValue();
        QuickSort.sort(arrayToSort);
    }

    public static void mergeSort(Array array) {
        int[] arrayToSort = array.getValue();
        MergeSort.sort(arrayToSort);
    }

    public static void bubleSort(Array array) {
        int[] arrayToSort = array.getValue();
        BubbleSort.sort(arrayToSort);
    }

    //TODO check method logic
    public static int getMaxElement(Array arr) {
        try {
            Array clone = arr.clone();
            quickSort(clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        int lastIndex = arr.length() - 1;
        return (lastIndex >= 0) ? arr.getElementAt(lastIndex) : null;
    }

    public static int getMinElement(Array arr) {
        try {
            Array clone = arr.clone();
            quickSort(clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return arr.getElementAt(0);
    }

    public static ArrayList getFibList(Array array) {
        int[] srcArray = array.getValue();
        return Fibonacci.of(srcArray);
    }

    public static List<Integer> getPrimeList(Array array) {
        List<Integer> arrayList = new ArrayList();
        int[] value = array.getValue();

        for (int element :
                value) {
            if (PrimeNum.isPrime(element)) arrayList.add(element);
        }

        return arrayList;
    }

    public static List<Integer> getThreeDigitsNumRepetitionList(Array array) {
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

    public static Array getAarrayFromConsole(){
        int[] ints = DataScanner.enterIntArrayFromConsole();

        return new Array(ints);
    }

    public static Array getArrayFromFile(String path) throws ReadFileException {
        List<Integer> list = DataScanner.enterIntArrayFromFile(path);
        return new Array(list);
    }

    public static Array getRandomArray(){
        int min = 0;
        int max = Integer.MAX_VALUE;
        int arrayLength = RandomInt.get(min, max);

        int[]arr = new int[arrayLength];
        for (int element:
             arr) {
            element = RandomInt.get(min, max);
        }

        return new Array(arr);
    }
}
