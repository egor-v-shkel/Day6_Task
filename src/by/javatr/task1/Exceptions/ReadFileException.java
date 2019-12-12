package by.javatr.task1.Exceptions;

import java.io.IOException;

public class ReadFileException extends IOException {

    public ReadFileException() {
        super();
    }

    public ReadFileException(String path, Throwable cause) {
        super("Can't read file from path: " + path, cause);
    }

}
