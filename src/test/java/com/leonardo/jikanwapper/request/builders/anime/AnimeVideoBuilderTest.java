package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.anime.staff.AnimeStaffData;
import com.leonardo.jikanwapper.records.anime.video.AnimeVideoData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeVideoBuilderTest {

    @Test
    @DisplayName("Should build a request for animesVideo")
    void buildTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1/videos";

        //when
        Request<AnimeVideoData> actual = JikanBuilder.anime().id(1).videos().build();

        //then
        assertNotNull(actual);
        assertEquals(expected, actual.toString());

    }

    @Test
    @DisplayName("Should return an animeVideoEpisodeBuilder with the correct url")
    void episodesTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1/videos/episodes";

        //when
        AnimeVideoEpisodesBuilder actual = JikanBuilder.anime().id(1).videos().episodes();

        //then
        assertEquals(expected, actual.getUrl());

    }

}