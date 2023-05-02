package com.leonardo.jikanwapper.records.anime.moreinfo;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.records.anime.news.AnimeNewsData;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeMoreInfoDataTest {

    @Test
    @DisplayName("Serialization test for animeMoreInfoData")
    void serializationTest(){

        //when
        AnimeMoreInfoData animeData = JikanBuilder.anime().id(1).moreInfo().build().request();

        //then
        assertNotNull(animeData);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}