package by.javatr.task1.valid;

import by.javatr.task1.utill.Array;

public class ArrayValidator {

    private ArrayValidator() {
    }

    public static void validateIndex(Array arr, int index) throws ArrayIndexOutOfBoundsException {
        if (index > arr.length() - 1 && index < 0)
            throw new ArrayIndexOutOfBoundsException(index);
    }

    public static void validateNotNull(Object object) throws IllegalArgumentException {
        if (object == null) throw new IllegalArgumentException("Can't pass null as a parameter.");
    }
}
