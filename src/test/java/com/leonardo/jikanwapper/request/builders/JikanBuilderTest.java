package com.leonardo.jikanwapper.request.builders;

import com.leonardo.jikanwapper.request.builders.anime.AnimeBuilder;
import com.leonardo.jikanwapper.request.builders.genre.GenreBuilder;
import com.leonardo.jikanwapper.request.builders.magazine.MagazineBuilder;
import com.leonardo.jikanwapper.request.builders.recommendations.RecommendationBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JikanBuilderTest {

    @Test
    @DisplayName("Should return a GenreBuilder")
    void genre() {
        //when
        GenreBuilder builder = JikanBuilder.genre();

        //then
        assertNotNull(builder);
    }

    @Test
    @DisplayName("Should return a MagazineBuilder")
    void magazine() {
        //when
        MagazineBuilder builder = JikanBuilder.magazine();

        //then
        assertNotNull(builder);
    }

    @Test
    @DisplayName("Should return a RecommendationBuilder")
    void recommendation() {
        //when
        RecommendationBuilder builder = JikanBuilder.recommendations();

        //then
        assertNotNull(builder);
    }

    @Test
    @DisplayName("Should return a AnimeBuilder")
    void anime() {
        //when
        AnimeBuilder builder = JikanBuilder.anime();

        //then
        assertNotNull(builder);
    }
}