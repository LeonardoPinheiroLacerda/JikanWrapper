package com.leonardo.jikanwapper.records.genres;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class GenreDataTest {

    @Test
    @DisplayName("Serialization test for GenreData (anime)")
    void serializationAnimeTest() {

        //when
        GenreData actual = JikanBuilder.genre().anime().build().request();

        //then
        assertNotNull(actual);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

    @Test
    @DisplayName("Serialization test for GenreData (manga)")
    void serializationMangaTest() {

        //when
        GenreData actual = JikanBuilder.genre().manga().build().request();

        //then
        assertNotNull(actual);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}