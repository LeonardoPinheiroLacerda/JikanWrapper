package com.leonardo.jikanwapper.records.anime.external;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.records.anime.AnimeData;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeExternalDataTest {

    @Test
    @DisplayName("Serialization test for animeExternalData")
    void serializationTest(){

        //when
        AnimeExternalData animeData = JikanBuilder.anime().id(1).external().build().request();

        //then
        assertNotNull(animeData);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}