package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.anime.episode.AnimeEpisodeData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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

}