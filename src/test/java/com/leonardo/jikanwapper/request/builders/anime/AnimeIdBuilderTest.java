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
}