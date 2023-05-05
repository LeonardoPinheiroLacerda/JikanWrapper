package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.anime.AnimeData;
import com.leonardo.jikanwapper.records.anime.streaming.AnimeStreamingData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeStreamingBuilderTest {

    @Test
    @DisplayName("Should build a request for animesStreaming")
    void buildTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1/streaming";

        //when
        Request<AnimeStreamingData> actual = JikanBuilder.anime().id(1).streaming().build();

        //then
        assertNotNull(actual);
        assertEquals(expected, actual.toString());

    }

}