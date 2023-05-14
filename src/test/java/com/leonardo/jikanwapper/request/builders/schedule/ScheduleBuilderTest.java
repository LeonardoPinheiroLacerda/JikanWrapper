package com.leonardo.jikanwapper.request.builders.schedule;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.recommendation.RecommendationData;
import com.leonardo.jikanwapper.records.schedule.ScheduleData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import com.leonardo.jikanwapper.request.builders.recommendations.RecommendationQueryBuilder;
import com.leonardo.jikanwapper.request.query_enums.DayOfWeek;
import com.leonardo.jikanwapper.util.QueryParameter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScheduleBuilderTest {

    @Test
    @DisplayName("Should build a request for schedule")
    void buildTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.SCHEDULE_ENDPOINT;

        //when
        ScheduleBuilder scheduleBuilder = JikanBuilder.schedule();
        Request<ScheduleData> actual = scheduleBuilder.build();

        //then
        assertNotNull(actual);
        assertEquals(expected, actual.toString());

    }

    @Test
    @DisplayName("Should add page query parameter")
    void pageTest() {

        //when
        ScheduleBuilder actual = JikanBuilder
                .schedule()
                .page(1);

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter("page=1")));

    }

    @Test
    @DisplayName("Should add limit query parameter")
    void limitTest() {

        //when
        ScheduleBuilder actual = JikanBuilder
                .schedule()
                .limit(1);

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter("limit=1")));

    }

    @Test
    @DisplayName("Should add filter query parameter")
    void filterTest() {

        //when
        ScheduleBuilder actual = JikanBuilder
                .schedule()
                .filter(DayOfWeek.MONDAY);

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter("filter=monday")));

    }

}