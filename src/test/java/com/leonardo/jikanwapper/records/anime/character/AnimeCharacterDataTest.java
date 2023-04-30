package com.leonardo.jikanwapper.records.anime.character;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AnimeCharacterDataTest {

    @Test
    @DisplayName("Serialization test for AnimeCharacterData")
    void serializationTest() {

        //given
        Integer id = 1;

        //when
        AnimeCharacterData actual = JikanBuilder.anime().id(id).character().build().request();

        //then
        assertNotNull(actual);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}