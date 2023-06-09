package com.leonardo.jikanwapper.records.anime.relations;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.records.anime.AnimeData;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeRelationsDataTest {

    @Test
    @DisplayName("Serialization test for animeRelations")
    void serializationTest(){

        //when
        AnimeRelationsData animeData = JikanBuilder.anime().id(1).relations().build().request();

        //then
        assertNotNull(animeData);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}