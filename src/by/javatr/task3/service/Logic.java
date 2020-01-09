package by.javatr.task3.service;

public interface Logic {
    String charReplace(String word, int k, char c);

    String correctChar(String word);

    String stringReplace(String word, int length, String substring);

    String symbolsDelete(String text);

    String deleteFirstConsonant(String word, int length);
}
