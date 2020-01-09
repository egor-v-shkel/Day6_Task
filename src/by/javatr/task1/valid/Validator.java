package by.javatr.task1.valid;

import by.javatr.task1.utill.Array;

public class Validator {

    private Validator() {}

    public static void index(Array arr, int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index > arr.length() - 1)
            throw new ArrayIndexOutOfBoundsException(index);
    }

    public static void parameter(Object object) throws IllegalArgumentException {
        if (object == null) throw new IllegalArgumentException("Can't pass null as a parameter.");
    }
}
