package com.leonardo.jikanwapper.records.anime.recommendations;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AnimeRecommendationsDataTest {

    @Test
    @DisplayName("Serialization test for AnimeRecommendationsData")
    void serializationTest() {

        //when
        AnimeRecommendationsData actual = JikanBuilder.anime().id(1).recommendations().build().request();

        //then
        assertNotNull(actual);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}