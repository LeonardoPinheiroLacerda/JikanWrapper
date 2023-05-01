package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.anime.episode.AnimeEpisodeData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import com.leonardo.jikanwapper.request.builders.magazine.MagazineBuilder;
import com.leonardo.jikanwapper.util.QueryParameter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeEpisodeBuilderTest {

    @Test
    @DisplayName("Should build a request for animesEpisodes")
    void buildTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1/episodes";

        //when
        Request<AnimeEpisodeData> actual = JikanBuilder.anime().id(1).episodes().build();

        //then
        assertNotNull(actual);
        assertEquals(expected, actual.toString());

    }

    @Test
    @DisplayName("Should return an AnimeEpisodeIdBuilder with the expected url")
    void idTest() {
        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1/episodes/1";

        //when
        AnimeEpisodeIdBuilder actual = JikanBuilder.anime().id(1).episodes().id(1);

        //then
        assertEquals(expected, actual.getUrl());
    }

    @Test
    @DisplayName("Should add page query parameter")
    void page() {

        //when
        AnimeEpisodeBuilder actual = JikanBuilder
                .anime()
                .id(1)
                .episodes()
                .page(1);

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter("page=1")));
    }

}