package com.leonardo.jikanwapper.records.recommendation;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.records.genres.GenreData;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecommendationDataTest {
    @Test
    @DisplayName("Serialization test for RecommendationData (anime)")
    void serializationAnimeTest() {

        //when
        RecommendationData actual = JikanBuilder.recommendations().anime().build().request();

        //then
        assertNotNull(actual);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

    @Test
    @DisplayName("Serialization test for RecommendationData (manga)")
    void serializationMangaTest() {

        //when
        RecommendationData actual = JikanBuilder.recommendations().manga().build().request();

        //then
        assertNotNull(actual);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}