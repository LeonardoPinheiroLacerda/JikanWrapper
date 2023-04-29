package com.leonardo.jikanwapper.request.builders.genre;

import com.leonardo.jikanwapper.JikanConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenreBuilderTest {

    @Test
    @DisplayName("Should return GenreQueryBuilder with the url for anime")
    void anime() {

        //given
        String expected = JikanConstants.HOST + "/genres/anime";

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
        String expected = JikanConstants.HOST + "/genres/manga";

        //when
        GenreBuilder genreBuilder = new GenreBuilder();

        GenreQueryBuilder genreQueryBuilder = genreBuilder.manga();

        String actual = genreQueryBuilder.getUrl();

        //then
        assertEquals(expected, actual);
    }
}