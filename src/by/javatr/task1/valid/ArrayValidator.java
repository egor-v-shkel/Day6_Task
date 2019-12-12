package by.javatr.task1.valid;

import by.javatr.task1.Array;

public class ArrayValidator {

    private ArrayValidator() {
    }

    public static void validateIndex(Array arr, int index) throws ArrayIndexOutOfBoundsException {

        if (index > arr.length() - 1 && index < 0)
            throw new ArrayIndexOutOfBoundsException(index);
    }

    public static void validateNotNull(int[] arr) throws NullPointerException {
        if (arr == null) throw new NullPointerException();
    }

    public static void validateNotNull(Array arr) throws NullPointerException {
        validateNotNull(arr.getValue());
    }
}
