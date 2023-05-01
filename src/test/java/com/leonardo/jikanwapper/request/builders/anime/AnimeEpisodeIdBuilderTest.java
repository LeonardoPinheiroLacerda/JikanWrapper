package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.anime.episode.AnimeEpisodeIdData;
import com.leonardo.jikanwapper.records.anime.staff.AnimeStaffData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeEpisodeIdBuilderTest {

    @Test
    @DisplayName("Should build a request for AnimeEpisodeId")
    void buildTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1/episodes/1";

        //when
        Request<AnimeEpisodeIdData> actual = JikanBuilder.anime().id(1).episodes().id(1).build();

        //then
        assertNotNull(actual);
        assertEquals(expected, actual.toString());

    }

}