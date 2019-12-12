package by.javatr.task3.run;

import by.javatr.Scanner.DataScanner;
import by.javatr.task1.Exceptions.ReadFileException;

public class Run {

    public static void main(String[] args) {
        String consoleText1 = DataScanner.enterLineFromConsole();
        String fileText1 = null;
        try {
             fileText1 = DataScanner.readFile("text.txt");
        } catch (ReadFileException e) {
            e.printStackTrace();
        }

        System.out.println(fileText1);
    }
}
