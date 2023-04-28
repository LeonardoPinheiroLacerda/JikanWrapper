package com.leonardo.jikanwapper.request.builders.genre;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenreBuilderTest {

    @Test
    @DisplayName("Should return GenreQueryBuilder with the url for anime")
    void anime() {

        //given
        String expected = "https://api.jikan.moe/v4/genres/anime";

        //when
        GenreBuilder genreBuilder = new GenreBuilder();

        GenreQueryBuilder genreQueryBuilder = genreBuilder.anime();

        String actual = genreQueryBuilder.getUrl();

        //then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should return GenreQueryBuilder with the url for manga")
    void manga() {

        //given
        String expected = "https://api.jikan.moe/v4/genres/manga";

        //when
        GenreBuilder genreBuilder = new GenreBuilder();

        GenreQueryBuilder genreQueryBuilder = genreBuilder.manga();

        String actual = genreQueryBuilder.getUrl();

        //then
        assertEquals(expected, actual);
    }
}