package by.javatr.task3.logic;

public class StringBuilderLogic {

    public static void charReplace(String[] words, int k, char c) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > k) {
                StringBuilder sb = new StringBuilder();
                sb.insert(k, c);
                words[i] = sb.toString();
            }

        }
    }

    public static void correctChar(String[] words, char pivotChar, char correct, char with){


    }
}
