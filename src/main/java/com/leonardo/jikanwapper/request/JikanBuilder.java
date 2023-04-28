package com.leonardo.jikanwapper.request;

import com.leonardo.jikanwapper.request.genre.GenreBuilder;

public class JikanBuilder {

    public static GenreBuilder genre() {
        return new GenreBuilder();
    }

}
