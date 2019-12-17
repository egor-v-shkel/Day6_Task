package by.javatr.task3.logic;

import by.javatr.task3.valid.TextValidator;

public class RegExLogic {

    private RegExLogic() {
    }

    public static String charReplace(String word, int k, char c) {
        TextValidator.validateStringArg(word);
        StringBuilder sb = new StringBuilder(word);
        String pattern = String.format("[a-zA-Z]{%d,}", k);

        if (word.matches(pattern)) sb.setCharAt(k - 1, c);
        return sb.toString();
    }

    public static String correctChar(String word) {
        TextValidator.validateStringArg(word);

        return word.replaceAll("PA", "PO");
    }

    public static String stringReplace(String word, int length, String substring) {
        TextValidator.validateStringArg(word);
        StringBuilder sb = new StringBuilder(word);
        String pattern = String.format("[a-zA-Z]{%d}", length);

        if (word.matches(pattern)) sb = new StringBuilder(substring);
        return sb.toString();
    }

    public static String symbolsDelete(String text) {
        return text
                .replaceAll("([^a-zA-Z]+)", " ")
                .trim();
    }

    public static String deleteFirstConsonant(String word, int length) {
        String pattern = String.format("^[^aeiou][a-zA-Z]{%d}$", length - 1);

        return word.toLowerCase().matches(pattern) ?
                "" :
                word;
    }
}
