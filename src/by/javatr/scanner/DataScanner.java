package by.javatr.scanner;

import by.javatr.task1.Exceptions.ParseArrayException;
import by.javatr.task1.Exceptions.ReadFileException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DataScanner {

    private DataScanner() {
    }

    public static String enterLineFromConsole() {

        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }

    public static int[] enterIntArrayFromConsole() throws InputMismatchException {

        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();

        boolean inputCorrect = DataScannerValidator.inputIsArray(inputStr);
        if (!inputCorrect) throw new InputMismatchException("Проверьте правильность ввода.");

        return parseConsoleInputToArray(inputStr);
    }

    private static int[] parseConsoleInputToArray(String input) {

        String[] strArray = input.split(" ");
        int size = strArray.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }
        return arr;
    }

    public static String readFile(String path) throws ReadFileException {
        File file = new File(path);
        StringBuilder sb = new StringBuilder();
        Scanner sc;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new ReadFileException(path, e);
        }

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            sb.append(line);
        }

        return sb.toString();
    }

    public static List<Integer> enterIntArrayFromFile(String path) throws ReadFileException {
        DataScannerValidator.notNullObject(path);
        String content = readFile(path);

        return parseFileToArray(content);
    }

    private static List<Integer> parseFileToArray(String content) {
        boolean contentMatch = DataScannerValidator.contentIsArray(content);

        if (!contentMatch) throw new ParseArrayException("String don't meet array pattern requirements.");

        List<Integer> lst = new ArrayList<>();

        String[] split = content
                .replaceAll("[\\[\\]]", "")
                .split(", ");

        for (String str :
                split) {
            lst.add(Integer.parseInt(str));
        }

        return lst;
    }

}
