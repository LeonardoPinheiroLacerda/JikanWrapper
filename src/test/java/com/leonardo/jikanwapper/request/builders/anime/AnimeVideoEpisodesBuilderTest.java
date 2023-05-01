package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.anime.video.AnimeVideoData;
import com.leonardo.jikanwapper.records.anime.video.AnimeVideoEpisodeData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import com.leonardo.jikanwapper.request.builders.magazine.MagazineBuilder;
import com.leonardo.jikanwapper.util.QueryParameter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeVideoEpisodesBuilderTest {

    @Test
    @DisplayName("Should build a request for animesVideoEpisode")
    void buildTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1/videos/episodes";

        //when
        Request<AnimeVideoEpisodeData> actual = JikanBuilder.anime().id(1).videos().episodes().build();

        //then
        assertNotNull(actual);
        assertEquals(expected, actual.toString());

    }

    @Test
    @DisplayName("Should add page query parameter")
    void page() {

        //when
        AnimeVideoEpisodesBuilder actual = JikanBuilder
                .anime()
                .id(1)
                .videos()
                .episodes()
                .page(1);

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter("page=1")));
    }


}