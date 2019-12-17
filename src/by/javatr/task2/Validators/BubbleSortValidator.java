package by.javatr.task2.Validators;

public class BubbleSortValidator {
    public static void validateNotNull(Object object) throws IllegalArgumentException {
        if (object == null) throw new IllegalArgumentException("Can't pass null as a parameter.");
    }
}
