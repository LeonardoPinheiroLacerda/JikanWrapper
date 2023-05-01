package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.anime.AnimeData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AnimeIdBuilderTest {

    @Test
    @DisplayName("Should return an animeFullBuilder with the correct url")
    void fullTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1/full";

        //when
        AnimeFullBuilder actual = JikanBuilder.anime().id(1).full();

        //then
        assertEquals(expected, actual.getUrl());

    }

    @Test
    @DisplayName("Should build a request for animesId")
    void buildTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1";

        //when
        Request<AnimeData> actual = JikanBuilder.anime().id(1).build();

        //then
        assertNotNull(actual);
        assertEquals(expected, actual.toString());

    }

    @Test
    @DisplayName("Should return an animeCharacterBuilder with the correct url")
    void charactersTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1/characters";

        //when
        AnimeCharacterBuilder actual = JikanBuilder.anime().id(1).character();

        //then
        assertEquals(expected, actual.getUrl());

    }

    @Test
    @DisplayName("Should return an animeStaffBuilder with the correct url")
    void staffTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1/staff";

        //when
        AnimeStaffBuilder actual = JikanBuilder.anime().id(1).staff();

        //then
        assertEquals(expected, actual.getUrl());

    }

    @Test
    @DisplayName("Should return an animeEpisodeBuilder with the correct url")
    void episodesTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1/episodes";

        //when
        AnimeEpisodeBuilder actual = JikanBuilder.anime().id(1).episodes();

        //then
        assertEquals(expected, actual.getUrl());

    }

    @Test
    @DisplayName("Should return an animeNewsBuilder with the correct url")
    void newsTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1/news";

        //when
        AnimeNewsBuilder actual = JikanBuilder.anime().id(1).news();

        //then
        assertEquals(expected, actual.getUrl());

    }

    @Test
    @DisplayName("Should return an animeForumBuilder with the correct url")
    void forumTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1/forum";

        //when
        AnimeForumBuilder actual = JikanBuilder.anime().id(1).forum();

        //then
        assertEquals(expected, actual.getUrl());

    }

    @Test
    @DisplayName("Should return an animeVideoBuilder with the correct url")
    void videoTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1/videos";

        //when
        AnimeVideoBuilder actual = JikanBuilder.anime().id(1).videos();

        //then
        assertEquals(expected, actual.getUrl());

    }
}