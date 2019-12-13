package by.javatr.task3.logic;

import by.javatr.task3.valid.TextValidator;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderLogic {

    private StringBuilderLogic() {
    }

    public static String charReplace(String word, int k, char c) {
        TextValidator.validateStringArg(word);

        StringBuilder sb = new StringBuilder(word);
        int length = sb.length();

        if (length > k) {
            sb.setCharAt(k, c);
        }
        return sb.toString();
    }

    public static String correctChar(String word) {
        TextValidator.validateStringArg(word);

        StringBuilder sb = new StringBuilder(word);

        for (int i = 0; i < word.length() - 2; i++) {
            if (word.charAt(i) == 'P' && word.charAt(i + 1) == 'O')
                sb.setCharAt(i, 'A');
        }

        return sb.toString();
    }

    public static String stringReplace(String word, int length, String substring) {
        TextValidator.validateStringArg(word);

        StringBuilder sb = new StringBuilder(word);

        if (word.length() == length) sb = new StringBuilder(substring);
        return sb.toString();
    }

    public static String symbolsDelete(String text) {
        TextValidator.validateStringArg(text);

        StringBuilder sb = new StringBuilder();
        List<StringBuilder> sbList = new ArrayList<>();

        while (!Character.isLetter(sb.charAt(0))) {
            sb.deleteCharAt(0);
        }

        for (int i = 0; i < sb.length(); i++) {
            if (!Character.isLetter(sb.charAt(i))
                    && !Character.isWhitespace(sb.charAt(i))) {
                sb.setCharAt(i, ' ');
            }
        }
        return sb.toString();
    }

    public static String deleteFirstConsonant(String word, int length) {
        TextValidator.validateStringArg(word);
        TextValidator.vaildateMagicString(word);

        StringBuilder sb = new StringBuilder(word);

        char firstChar = word.charAt(0);
        if (word.length() != length || word.length() == 0 || isConsonant(firstChar)) return sb.toString();
        return sb.deleteCharAt(0).toString();
    }

    private static boolean isConsonant(char c) {
        boolean stat;

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                stat = false;
                break;
            default:
                stat = true;
        }

        return stat;
    }
}
