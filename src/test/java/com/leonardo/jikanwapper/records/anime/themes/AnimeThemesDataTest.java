package com.leonardo.jikanwapper.records.anime.themes;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.records.anime.AnimeData;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeThemesDataTest {

    @Test
    @DisplayName("Serialization test for animeThemesData")
    void serializationTest(){

        //when
        AnimeThemesData animeData = JikanBuilder.anime().id(1).themes().build().request();

        //then
        assertNotNull(animeData);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}