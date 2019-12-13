package by.javatr.task3.utill;

import by.javatr.task3.logic.RegExLogic;
import by.javatr.task3.logic.StringBuilderLogic;

public class TextUtil {

    public enum Engine {REGEX, STRING_BUILDER}

    private static Engine currentEngine = Engine.REGEX;

    private TextUtil() {
    }

    public static void switchEngine() {
        currentEngine = (currentEngine == Engine.REGEX) ?
                Engine.STRING_BUILDER :
                Engine.REGEX;
    }

    public static void switchTo(Engine engine) {
        currentEngine = engine;
    }

    public static String replace(String text, int index, char c, Engine engine) {
        StringBuilder sb = new StringBuilder();
        String[] split = split(text);

        for (String str :
                split) {
            if (str.matches("[a-zA-z]+")) {
                if (currentEngine == Engine.REGEX) {
                    String replace = RegExLogic.charReplace(str, index, c);
                    sb.append(replace);
                } else {
                    String replace = StringBuilderLogic.charReplace(str, index, c);
                    sb.append(replace);
                }
            } else sb.append(str);
        }
        return sb.toString();
    }

    public static String correctChar(String text) {
        StringBuilder sb = new StringBuilder();
        String[] split = split(text);

        for (String str :
                split) {
            if (str.matches("[a-zA-z]+")) {
                if (currentEngine == Engine.REGEX) {
                    String replace = RegExLogic.correctChar(str);
                    sb.append(replace);
                } else {
                    String replace = StringBuilderLogic.correctChar(str);
                    sb.append(replace);
                }
            } else sb.append(str);
        }
        return sb.toString();
    }

    public static String stringReplace(String text, int length, String replaceWord) {
        StringBuilder sb = new StringBuilder();
        String[] split = split(text);

        for (String str :
                split) {
            if (str.matches("[a-zA-z]+")) {
                if (currentEngine == Engine.REGEX) {
                    String replace = RegExLogic.stringReplace(str, length, replaceWord);
                    sb.append(replace);
                } else {
                    String replace = StringBuilderLogic.stringReplace(str, length, replaceWord);
                    sb.append(replace);
                }
            } else sb.append(str);
        }
        return sb.toString();
    }

    public static String symbolDelete(String text) {
        return  (currentEngine == Engine.REGEX) ?
                RegExLogic.symbolsDelete(text):
                StringBuilderLogic.symbolsDelete(text);
    }

    public static String deleteFirstConsonant(String text, int length) {
        StringBuilder sb = new StringBuilder();
        String[] split = split(text);

        for (String str :
                split) {
            if (str.matches("[a-zA-z]+")) {
                if (currentEngine == Engine.REGEX) {
                    String replace = RegExLogic.deleteFirstConsonant(str, length);
                    sb.append(replace);
                } else {
                    String replace = StringBuilderLogic.deleteFirstConsonant(str, length);
                    sb.append(replace);
                }
            } else sb.append(str);
        }
        return sb.toString();
    }

    private static String[] split(String text) {
        return text.split("(?=[\\., <])|(?<=[\\., <])");
    }
}
