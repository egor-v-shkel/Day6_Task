package by.javatr.scanner;

public class DataScannerValidator {
    public static boolean inputIsArray(String input) {

        return input.matches("[-?\\d]+(?: -?\\d+)*");
    }

    public static boolean contentIsArray(String possibleArray){
        return possibleArray.matches("\\[(-?\\d)?(, -?\\d)*\\]$");
    }

    public static boolean notNullObject(Object obj){
        if (obj == null) throw new IllegalArgumentException("Path can't be null.");
        return true;
    }
}
