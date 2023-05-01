package com.leonardo.jikanwapper.records.anime.news;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.records.anime.AnimeData;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeNewsDataTest {

    @Test
    @DisplayName("Serialization test for animeNewsData")
    void serializationTest(){

        //when
        AnimeNewsData animeData = JikanBuilder.anime().id(1).news().build().request();

        //then
        assertNotNull(animeData);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}