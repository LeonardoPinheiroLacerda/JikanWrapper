package com.leonardo.jikanwapper.records.anime.episode;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeEpisodeIdDataTest {

    @Test
    @DisplayName("Serialization test for animeEpisodeIdData")
    void serializationTest() {

        //when
        AnimeEpisodeIdData animeData = JikanBuilder.anime().id(1).episodes().id(1).build().request();

        //then
        assertNotNull(animeData);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}