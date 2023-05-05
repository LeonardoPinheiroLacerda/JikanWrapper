package com.leonardo.jikanwapper.records.anime.streaming;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.records.anime.AnimeData;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeStreamingDataTest {

    @Test
    @DisplayName("Serialization test for animeStreaming")
    void serializationTest(){

        //when
        AnimeStreamingData animeData = JikanBuilder.anime().id(1).streaming().build().request();

        //then
        assertNotNull(animeData);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}