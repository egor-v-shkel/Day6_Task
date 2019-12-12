package by.javatr.task1.utill;

import by.javatr.task1.Array;

public class Arrays {

    private Arrays() {
    }

    public static void quickSort(Array array){
        QuickSort.sort(array);
    }

    public static void mergeSort(Array array){
        MergeSort.sort(array);
    }

    //TODO implement another sorting algorithm
    public static void bubleSort(Array array){
        BubbleSort.sort(array);
    }

    //TODO check method logic
    public static int getMaxElem(Array arr){
        quickSort(arr);

        int lastIndex = arr.length() - 1;
        return (lastIndex >= 0) ? arr.getElementAt(lastIndex):-1;
    }

    public static int getMinElem(Array arr){
        quickSort(arr);

        return arr.getElementAt(0);
    }
}
