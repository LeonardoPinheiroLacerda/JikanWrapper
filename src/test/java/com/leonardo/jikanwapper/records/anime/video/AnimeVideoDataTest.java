package com.leonardo.jikanwapper.records.anime.video;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AnimeVideoDataTest {

    @Test
    @DisplayName("Serialization test for AnimeVideoData")
    void serializationTest() {

        //when
        AnimeVideoData actual = JikanBuilder.anime().id(1).videos().build().request();

        //then
        assertNotNull(actual);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}