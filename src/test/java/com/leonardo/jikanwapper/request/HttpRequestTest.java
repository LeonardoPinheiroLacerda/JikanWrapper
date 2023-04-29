package com.leonardo.jikanwapper.request;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.records.genres.GenreData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HttpRequestTest {

    @Test
    @DisplayName("Should make a request to https://api.jikan.moe/v4/genres/anime and serialize to the type GenreData")
    void test() {

        //given
        final String url = JikanConstants.HOST + "/genres/anime";

        //when
        GenreData actual = HttpRequest.get(url, GenreData.class);

        //then
        assertNotNull(actual);
        assertDoesNotThrow(() -> new JikanRequestException(""));
    }

    @Test
    @DisplayName("Should throw JikanRequestException because it's a invalid request")
    void test1() {

        //given
        final String url = JikanConstants.HOST + "/invalid-url";

        //then
        assertThrows(JikanRequestException.class, () -> HttpRequest.get(url, GenreData.class));

    }



}