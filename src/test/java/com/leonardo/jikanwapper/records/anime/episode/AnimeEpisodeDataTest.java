package com.leonardo.jikanwapper.records.anime.episode;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AnimeEpisodeDataTest {

    @Test
    @DisplayName("Serialization test for animeEpisodeData")
    void serializationTest() {

        //when
        AnimeEpisodeData animeData = JikanBuilder.anime().id(1).episodes().build().request();

        //then
        assertNotNull(animeData);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}