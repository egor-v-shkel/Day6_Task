package by.javatr.task1.runner;

import by.javatr.task1.Exceptions.ReadFileException;
import by.javatr.task1.utill.Array;
import by.javatr.task1.utill.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Run {

    public static void main(String[] args) {
        int[] ints1 = {556, 22, 123, 6, 812, 7, 3};
        List<Integer> list = new ArrayList<>();
        list.add(86);
        list.add(64);
        list.add(1);
        list.add(7);
        int[] ints2 = {5, 9, 99, 1, 568};

        Array myArray1 = new Array(ints1);
        Array myArray2 = new Array(list);
        Array myArray3 = new Array(ints2);

        Arrays.quickSort(myArray1);
        System.out.println(myArray1.toString());
        Arrays.mergeSort(myArray2);
        System.out.println(myArray2.toString());
        Arrays.bubleSort(myArray3);
        System.out.println(myArray3.toString());

        int index = Arrays.binarySearch(myArray1, 22);
        System.out.println(index);

        int max = Arrays.getMaxElement(myArray1);
        int min = Arrays.getMinElement(myArray1);
        System.out.println("Max = " + max + ", Min = " + min);

        List<Integer> primeList = Arrays.getPrimeList(myArray1);
        List<Integer> fibList = Arrays.getFibList(myArray1);
        List<Integer> threeDigitsNumRepetitionList = Arrays.getThreeDigitsNumRepetitionList(myArray1);
        System.out.println("Prime list: "+primeList);
        System.out.println("Fibonacci list: "+fibList);
        System.out.println("ThreDigits list: "+threeDigitsNumRepetitionList);

        Array randomArray = Arrays.getRandomArray(10);
        System.out.println(randomArray.toString());
        Array arrFromFile = null;
        try {
            Arrays.getArrayFromFile("res/array.txt");
        } catch (ReadFileException e) {
            e.printStackTrace();
        }
        System.out.println(arrFromFile.toString());
    }

}
