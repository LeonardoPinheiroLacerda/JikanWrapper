package com.leonardo.jikanwapper.request.builders.genre;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenreBuilderTest {

    @Test
    @DisplayName("Should return GenreQueryBuilder with the url for anime")
    void anime() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.GENRE_ENDPOINT + "/anime";

        //when
        GenreBuilder genreBuilder = JikanBuilder.genre();

        GenreQueryBuilder genreQueryBuilder = genreBuilder.anime();

        String actual = genreQueryBuilder.getUrl();

        //then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should return GenreQueryBuilder with the url for manga")
    void manga() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.GENRE_ENDPOINT + "/manga";

        //when
        GenreBuilder genreBuilder = JikanBuilder.genre();

        GenreQueryBuilder genreQueryBuilder = genreBuilder.manga();

        String actual = genreQueryBuilder.getUrl();

        //then
        assertEquals(expected, actual);
    }
}