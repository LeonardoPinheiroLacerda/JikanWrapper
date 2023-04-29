package com.leonardo.jikanwapper.request.builders.genre;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.genres.GenreData;
import com.leonardo.jikanwapper.request.QueryParameter;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import com.leonardo.jikanwapper.request.query_enums.GenreQueryFilter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenreQueryBuilderTest {

    @Test
    @DisplayName("Should build a request for genre")
    void buildTest() {

        //given
        String expected = JikanConstants.HOST + "/genres/anime";

        //when
        GenreQueryBuilder genreQueryBuilder = JikanBuilder.genre().anime();
        Request<GenreData> actual = genreQueryBuilder.build();

        //then
        assertNotNull(actual);
        assertEquals(expected, actual.toString());

    }

    @Test
    @DisplayName("Should add filter query parameter")
    void filterTest() {

        //when
        GenreQueryBuilder actual = JikanBuilder
                .genre()
                .anime()
                .filter(GenreQueryFilter.GENRES);

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter(GenreQueryFilter.GENRES.getQuery())));

    }
}