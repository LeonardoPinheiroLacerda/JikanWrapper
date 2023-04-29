package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeBuilderTest {

    @Test
    @DisplayName("Should return an AnimeIdBuilder with the expected url")
    void idTest() {
        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1";

        //when
        AnimeIdBuilder actual = JikanBuilder.anime().id(1);

        //then
        assertEquals(expected, actual.getUrl());
    }
}