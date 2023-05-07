package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.anime.search.AnimeSearchData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import com.leonardo.jikanwapper.request.query_enums.*;
import com.leonardo.jikanwapper.util.QueryParameter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AnimeSearchBuilderTest {

    @Test
    @DisplayName("Should build a request for animesSearch")
    void buildTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT;

        //when
        Request<AnimeSearchData> actual = JikanBuilder.anime().search().build();

        //then
        assertNotNull(actual);
        assertEquals(expected, actual.toString());

    }

    @Test
    @DisplayName("Should add page query parameter")
    void page() {

        //when
        AnimeSearchBuilder actual = JikanBuilder
                .anime()
                .search()
                .page(1);

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter("page=1")));
    }

    @Test
    @DisplayName("Should add limit query parameter")
    void limit() {

        //when
        AnimeSearchBuilder actual = JikanBuilder
                .anime()
                .search()
                .limit(1);

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter("limit=1")));
    }

    @Test
    @DisplayName("Should add q query parameter")
    void q() {

        //when
        AnimeSearchBuilder actual = JikanBuilder
                .anime()
                .search()
                .q("abc");

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter("q=abc")));
    }

    @Test
    @DisplayName("Should add min_score query parameter")
    void minScore() {

        //when
        AnimeSearchBuilder actual = JikanBuilder
                .anime()
                .search()
                .minScore(5.5f);

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter("min_score=5.5")));
    }

    @Test
    @DisplayName("Should add max_score query parameter")
    void maxScore() {

        //when
        AnimeSearchBuilder actual = JikanBuilder
                .anime()
                .search()
                .maxScore(5.5f);

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter("max_score=8.5")));
    }

    @Test
    @DisplayName("Should add letter query parameter")
    void letter() {

        //when
        AnimeSearchBuilder actual = JikanBuilder
                .anime()
                .search()
                .letter('a');

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter("letter=a")));
    }

    @Test
    @DisplayName("Should add start_date query parameter")
    void startDate() {

        //when
        AnimeSearchBuilder actual = JikanBuilder
                .anime()
                .search()
                .startDate(LocalDate.of(2023, 1, 1));

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter("start_date=2023-1-1")));
    }

    @Test
    @DisplayName("Should add end_date query parameter")
    void endDate() {

        //when
        AnimeSearchBuilder actual = JikanBuilder
                .anime()
                .search()
                .endDate(LocalDate.of(2023, 1, 1));

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter("end_date=2023-1-1")));
    }

    @Test
    @DisplayName("Should add genres query parameter")
    void genres() {

        //when
        AnimeSearchBuilder actual = JikanBuilder
                .anime()
                .search()
                .genres(Arrays.asList(1, 2, 3));

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter("genres=1,2,3")));
    }

    @Test
    @DisplayName("Should add genres_exclude query parameter")
    void genresExcludes() {

        //when
        AnimeSearchBuilder actual = JikanBuilder
                .anime()
                .search()
                .genresExclude(Arrays.asList(1, 2, 3));

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter("genres_exclude=1,2,3")));
    }

    @Test
    @DisplayName("Should add producers query parameter")
    void producers() {

        //when
        AnimeSearchBuilder actual = JikanBuilder
                .anime()
                .search()
                .producers(Arrays.asList(1, 2, 3));

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter("producers=1,2,3")));
    }


    @Test
    @DisplayName("Should add type query parameter")
    void type() {

        //when
        AnimeSearchBuilder actual = JikanBuilder
                .anime()
                .search()
                .type(AnimeSearchQueryType.TV);

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter(AnimeSearchQueryType.TV.getQuery())));
    }

    @Test
    @DisplayName("Should add status query parameter")
    void status() {

        //when
        AnimeSearchBuilder actual = JikanBuilder
                .anime()
                .search()
                .status(AnimeSearchQueryStatus.AIRING);

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter(AnimeSearchQueryStatus.AIRING.getQuery())));
    }

    @Test
    @DisplayName("Should add rating query parameter")
    void rating() {

        //when
        AnimeSearchBuilder actual = JikanBuilder
                .anime()
                .search()
                .rating(AnimeSearchQueryRating.G);

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter(AnimeSearchQueryRating.G.getQuery())));
    }

    @Test
    @DisplayName("Should add order_by and sort query parameters")
    void orderBy() {

        //when
        AnimeSearchBuilder actual = JikanBuilder
                .anime()
                .search()
                .orderBy(AnimeSearchQueryOrderBy.EPISODES, SearchQuerySort.ASC);

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter(AnimeSearchQueryOrderBy.EPISODES.getQuery())));
        assertTrue(actual.getQueries().contains(new QueryParameter(SearchQuerySort.ASC.getQuery())));
    }


}