package com.leonardo.jikanwapper.records.anime.search;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AnimeSearchDataTest {

    @Test
    @DisplayName("Serialization test for animeSearchData")
    void serializationTest(){

        //when
        AnimeSearchData animeData = JikanBuilder.anime().search().build().request();

        //then
        assertNotNull(animeData);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}