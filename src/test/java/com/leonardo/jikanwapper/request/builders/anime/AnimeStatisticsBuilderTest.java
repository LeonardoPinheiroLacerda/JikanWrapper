package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.anime.AnimeData;
import com.leonardo.jikanwapper.records.anime.statistics.AnimeStatisticsData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeStatisticsBuilderTest {

    @Test
    @DisplayName("Should build a request for animesStatistics")
    void buildTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1/statistics";

        //when
        Request<AnimeStatisticsData> actual = JikanBuilder.anime().id(1).statistics().build();

        //then
        assertNotNull(actual);
        assertEquals(expected, actual.toString());

    }

}