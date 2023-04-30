package com.leonardo.jikanwapper.records.anime;

import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeDataTest {

    @Test
    void serializationTest(){

        //given
        Integer id = 1;

        //when
        AnimeData animeData = JikanBuilder.anime().id(id).build().request();

        //then
        assertNotNull(animeData);

    }

}