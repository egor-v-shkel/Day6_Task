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

    public static String replace(String text, int index, char c) {
        StringBuilder sb = new StringBuilder();
        String[] split = split(text);

        for (String str :
                split) {
            if (str.matches("[a-zA-Z]+")) {
                String replace = null;
                switch (currentEngine) {
                    case REGEX:
                        replace = RegExLogic.charReplace(str, index, c);
                        break;
                    case STRING_BUILDER:
                        replace = StringBuilderLogic.charReplace(str, index, c);
                        break;
                }
                sb.append(replace);
            } else sb.append(str);
        }
        return sb.toString();
    }

    public static String correctChar(String text) {
        StringBuilder sb = new StringBuilder();
        String[] split = split(text);

        for (String str :
                split) {
            if (str.matches("[a-zA-Z]+")) {
                String replace = null;
                switch (currentEngine) {
                    case REGEX:
                        replace = RegExLogic.correctChar(str);
                        break;
                    case STRING_BUILDER:
                        replace = StringBuilderLogic.correctChar(str);
                        break;
                }
                sb.append(replace);
            } else sb.append(str);
        }
        return sb.toString();
    }

    public static String stringReplace(String text, int length, String replaceWord) {
        StringBuilder sb = new StringBuilder();
        String[] split = split(text);

        for (String str :
                split) {
            if (str.matches("[a-zA-Z]+")) {
                String replace = null;
                switch (currentEngine) {
                    case REGEX:
                        replace = RegExLogic.stringReplace(str, length, replaceWord);
                        break;
                    case STRING_BUILDER:
                        replace = StringBuilderLogic.stringReplace(str, length, replaceWord);
                        break;
                }
                sb.append(replace);
            } else sb.append(str);
        }
        return sb.toString();
    }

    public static String symbolDelete(String text) {
        return (currentEngine == Engine.REGEX) ?
                RegExLogic.symbolsDelete(text) :
                StringBuilderLogic.symbolsDelete(text);
    }

    public static String deleteFirstConsonant(String text, int length) {
        StringBuilder sb = new StringBuilder();
        String[] split = split(text);

        for (String str :
                split) {
            if (str.matches("[a-zA-Z]+")) {
                String replace = null;
                switch (currentEngine) {
                    case REGEX:
                        replace = RegExLogic.deleteFirstConsonant(str, length);
                        break;
                    case STRING_BUILDER:
                        replace = StringBuilderLogic.deleteFirstConsonant(str, length);
                        break;
                }
                sb.append(replace);
            } else sb.append(str);
        }
        return sb.toString();
    }

    private static String[] split(String text) {
        return text.split("(?=[., <])|(?<=[., <])");
    }
}
