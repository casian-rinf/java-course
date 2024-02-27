package com.rinftech.exceptions;

public class IncorrectFileExtensionException extends RuntimeException {
    public IncorrectFileExtensionException(String message) {
        super(message);
    }

    public IncorrectFileExtensionException(String message, Throwable cause) {
        super(message, cause);
    }
}
