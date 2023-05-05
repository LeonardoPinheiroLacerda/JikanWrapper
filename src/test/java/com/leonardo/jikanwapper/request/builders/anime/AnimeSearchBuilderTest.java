package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.anime.full.AnimeFullData;
import com.leonardo.jikanwapper.records.anime.search.AnimeSearchData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeSearchBuilderTest {

    @Test
    @DisplayName("Should build a request for animesSearch")
    void buildTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT;

        //when
        Request<AnimeSearchData> actual = JikanBuilder.anime().search().build();

        //then
        assertNotNull(actual);
        assertEquals(expected, actual.toString());

    }

}