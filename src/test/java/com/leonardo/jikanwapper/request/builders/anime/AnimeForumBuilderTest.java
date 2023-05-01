package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.anime.forum.AnimeForumData;
import com.leonardo.jikanwapper.records.maganize.MagazineData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import com.leonardo.jikanwapper.request.builders.magazine.MagazineBuilder;
import com.leonardo.jikanwapper.request.query_enums.FilterTopics;
import com.leonardo.jikanwapper.request.query_enums.MagazinesQueryOrderBy;
import com.leonardo.jikanwapper.request.query_enums.SearchQuerySort;
import com.leonardo.jikanwapper.util.QueryParameter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeForumBuilderTest {

    @Test
    @DisplayName("Should add filter query parameter")
    void orderBy() {

        //when
        AnimeForumBuilder actual = JikanBuilder
                .anime()
                .id(1)
                .forum()
                .filter(FilterTopics.EPISODE);

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter(FilterTopics.EPISODE.getQuery())));
    }

    @Test
    @DisplayName("Should build a request for animeForum")
    void build() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1/forum";

        //when
        AnimeForumBuilder magazineBuilder = JikanBuilder
                .anime()
                .id(1)
                .forum();

        Request<AnimeForumData> actual = magazineBuilder.build();

        //then
        assertNotNull(actual);
        assertEquals(expected, actual.toString());

    }

}