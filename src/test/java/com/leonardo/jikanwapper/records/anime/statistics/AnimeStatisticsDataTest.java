package com.leonardo.jikanwapper.records.anime.statistics;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.records.anime.staff.AnimeStaffData;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeStatisticsDataTest {

    @Test
    @DisplayName("Serialization test for AnimeStatisticsData")
    void serializationTest() {

        //when
        AnimeStatisticsData actual = JikanBuilder.anime().id(1).statistics().build().request();

        //then
        assertNotNull(actual);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}