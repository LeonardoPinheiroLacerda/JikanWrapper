package com.leonardo.jikanwapper.records.schedule;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.records.anime.AnimeData;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScheduleDataTest {

    @Test
    @DisplayName("Serialization test for scheduleData")
    void serializationTest(){

        //when
        ScheduleData animeData = JikanBuilder.schedule().build().request();

        //then
        assertNotNull(animeData);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}