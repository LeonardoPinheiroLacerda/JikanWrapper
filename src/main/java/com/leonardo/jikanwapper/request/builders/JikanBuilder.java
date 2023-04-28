package com.leonardo.jikanwapper.request.builders;

import com.leonardo.jikanwapper.request.builders.genre.GenreBuilder;
import com.leonardo.jikanwapper.request.builders.magazine.MagazineBuilder;

public class JikanBuilder {

    public static GenreBuilder genre() {
        return new GenreBuilder();
    }

    public static MagazineBuilder magazine() {
        return new MagazineBuilder();
    }

}
