package com.leonardo.jikanwapper.request.builders.magazine;

import com.leonardo.jikanwapper.records.maganize.MagazineData;
import com.leonardo.jikanwapper.request.QueryParameter;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import com.leonardo.jikanwapper.request.query_enums.MagazinesQueryOrderBy;
import com.leonardo.jikanwapper.request.query_enums.SearchQuerySort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagazineBuilderTest {

    @Test
    @DisplayName("Should add page query parameter")
    void page() {

        //when
        MagazineBuilder actual = JikanBuilder
                .magazine()
                .page(1);

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter("page=1")));
    }

    @Test
    @DisplayName("Should add limit query parameter")
    void limit() {

        //when
        MagazineBuilder actual = JikanBuilder
                .magazine()
                .limit(1);

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter("limit=1")));
    }

    @Test
    @DisplayName("Should add q query parameter")
    void query() {

        //when
        MagazineBuilder actual = JikanBuilder
                .magazine()
                .query("jump");

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter("q=jump")));
    }

    @Test
    @DisplayName("Should add letter query parameter")
    void letter() {

        //when
        MagazineBuilder actual = JikanBuilder
                .magazine()
                .letter('j');

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter("letter=j")));
    }

    @Test
    @DisplayName("Should add order_by and sort query parameter")
    void orderBy() {

        //when
        MagazineBuilder actual = JikanBuilder
                .magazine()
                .orderBy(MagazinesQueryOrderBy.NAME, SearchQuerySort.ASC);

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter(MagazinesQueryOrderBy.NAME.getQuery())));
        assertTrue(actual.getQueries().contains(new QueryParameter(SearchQuerySort.ASC.getQuery())));
    }

    @Test
    @DisplayName("Should build a request for magazine")
    void build() {

        //given
        String expected = "https://api.jikan.moe/v4/magazines";

        //when
        MagazineBuilder magazineBuilder = JikanBuilder
                .magazine();

        Request<MagazineData> actual = magazineBuilder.build();

        //then
        assertNotNull(actual);
        assertEquals(expected, actual.toString());

    }
}