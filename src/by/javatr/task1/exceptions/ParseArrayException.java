package by.javatr.task1.exceptions;

public class ParseArrayException extends RuntimeException {

    public ParseArrayException() {
        super();
    }

    public ParseArrayException(String reason) {
        super("Can't parse array from string. " + reason);
    }

}
