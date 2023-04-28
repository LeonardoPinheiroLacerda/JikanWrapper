package com.leonardo.jikanwapper.request;

import com.leonardo.jikanwapper.request.genre.GenreBuilder;
import com.leonardo.jikanwapper.request.magazine.MagazineBuilder;

public class JikanBuilder {

    public static GenreBuilder genre() {
        return new GenreBuilder();
    }

    public static MagazineBuilder magazine() {
        return new MagazineBuilder();
    }

}
