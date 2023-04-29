package com.leonardo.jikanwapper.exceptions;

public class JikanRequestException extends RuntimeException{

    public JikanRequestException(String message) {
        super(message);
    }

    public JikanRequestException(String message, Throwable cause) {
        super(message, cause);
    }

}
