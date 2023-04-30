package com.leonardo.jikanwapper.records.anime.full;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AnimeFullDataTest {

    @Test
    @DisplayName("Serialization test for AnimeFullData")
    void serializationTest() {

        //when
        AnimeFullData actual = JikanBuilder.anime().id(1).full().build().request();

        //then
        assertNotNull(actual);
        assertDoesNotThrow(() -> new JikanRequestException());

    }
}