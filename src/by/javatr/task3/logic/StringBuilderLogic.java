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

        if (k <= length) {
            sb.setCharAt(k-1, c);
        }
        return sb.toString();
    }

    public static String correctChar(String word) {
        TextValidator.validateStringArg(word);

        StringBuilder sb = new StringBuilder(word);

        for (int i = 0; i < word.length() - 2; i++) {
            if (word.charAt(i) == 'P' && word.charAt(i + 1) == 'A')
                sb.setCharAt(i+1, 'O');
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

        StringBuilder sb = new StringBuilder(text);

        for (int i = 0; i < sb.length(); i++) {
            if (!Character.isLetter(sb.charAt(i))){
                int intOffsetIndex = -1;
                for (int j = i; j < sb.length(); j++) {
                    if (Character.isLetter(sb.charAt(j))) {
                        intOffsetIndex = j;
                        break;
                    }
                }
                if (intOffsetIndex > -1)sb.replace(i, intOffsetIndex, " ");
                else sb.delete(i, sb.length());
                i++;
            }
        }
        return sb.toString();
    }

    public static String deleteFirstConsonant(String word, int length) {
        TextValidator.validateStringArg(word);
        TextValidator.vaildateMagicString(word);

        StringBuilder sb = new StringBuilder(word);

        char firstChar = Character.toLowerCase(word.charAt(0));
        if (word.length() != length || isVowel(firstChar)) return sb.toString();
        return "";
    }

    private static boolean isVowel(char c) {
        boolean stat;

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                stat = true;
                break;
            default:
                stat = false;
        }

        return stat;
    }
}
