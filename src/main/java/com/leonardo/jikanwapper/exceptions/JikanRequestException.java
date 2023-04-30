package com.leonardo.jikanwapper.exceptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class JikanRequestException extends RuntimeException{

    public JikanRequestException(String message) {
        super(message);
    }

    public JikanRequestException(String message, Throwable cause) {
        super(message, cause);
    }

}
