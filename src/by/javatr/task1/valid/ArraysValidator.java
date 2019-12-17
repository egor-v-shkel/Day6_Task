package by.javatr.task1.valid;

public class ArraysValidator {

    public static void validateNotNull(Object object) throws IllegalArgumentException {
        if (object == null) throw new IllegalArgumentException("Can't pass null as a parameter.");
    }
}
