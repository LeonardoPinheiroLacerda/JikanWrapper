package com.leonardo.jikanwapper.records.anime.forum;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AnimeForumDataTest {

    @Test
    @DisplayName("Serialization test for animeForum")
    void serializationTest() {

        //when
        AnimeForumData animeData = JikanBuilder.anime().id(1).forum().build().request();

        //then
        assertNotNull(animeData);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}