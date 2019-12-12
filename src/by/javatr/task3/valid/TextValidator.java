package by.javatr.task3.valid;

public class TextValidator {

    public static void validateStringArg(String str){
        if (str == null) throw new IllegalArgumentException("Input argument cant be null.");
    }
}
