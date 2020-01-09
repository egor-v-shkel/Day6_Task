package by.javatr.task3.service;

public class TextService {

    private static Logic currentLogic = LogicImpl.RegEx;

    private TextService() {}

    public static void switchLogic() {
        currentLogic = (currentLogic == LogicImpl.RegEx) ?
                LogicImpl.StringBuilder :
                LogicImpl.RegEx;
    }

    public static void switchTo(Logic logic) {
        currentLogic = logic;
    }

    public static String replace(String text, int index, char c) {
        StringBuilder sb = new StringBuilder();
        String[] split = split(text);

        for (String str :
                split) {
            if (str.matches("[a-zA-Z]+")) {
                String replace = currentLogic.charReplace(str, index, c);
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
                String replace = currentLogic.correctChar(str);
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
                String replace = currentLogic.stringReplace(str, length, replaceWord);
                sb.append(replace);
            } else sb.append(str);
        }
        return sb.toString();
    }

    public static String symbolDelete(String text) {
        return currentLogic.symbolsDelete(text);
    }

    public static String deleteFirstConsonant(String text, int length) {
        StringBuilder sb = new StringBuilder();
        String[] split = split(text);

        for (String str :
                split) {
            if (str.matches("[a-zA-Z]+")) {
                String replace = currentLogic.deleteFirstConsonant(str, length);
                sb.append(replace);
            } else sb.append(str);
        }
        return sb.toString();
    }

    private static String[] split(String text) {
        return text.split("(?=[., <])|(?<=[., <])");
    }
}
