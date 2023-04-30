package com.leonardo.jikanwapper.records.anime;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeDataTest {

    @Test
    @DisplayName("Serialization test for animeData")
    void serializationTest(){

        //when
        AnimeData animeData = JikanBuilder.anime().id(1).build().request();

        //then
        assertNotNull(animeData);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}