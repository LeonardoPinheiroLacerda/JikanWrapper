package com.leonardo.jikanwapper.request.builders;

import com.leonardo.jikanwapper.request.builders.genre.GenreBuilder;
import com.leonardo.jikanwapper.request.builders.magazine.MagazineBuilder;
import com.leonardo.jikanwapper.request.builders.recommendations.RecommendationBuilder;

public class JikanBuilder {

    public static GenreBuilder genre() {
        return new GenreBuilder();
    }

    public static MagazineBuilder magazine() {
        return new MagazineBuilder();
    }

    public static RecommendationBuilder recommendations() {
        return new RecommendationBuilder();
    }

}
