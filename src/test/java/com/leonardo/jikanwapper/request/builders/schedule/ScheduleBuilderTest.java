package com.leonardo.jikanwapper.request.builders.schedule;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.recommendation.RecommendationData;
import com.leonardo.jikanwapper.records.schedule.ScheduleData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import com.leonardo.jikanwapper.request.builders.recommendations.RecommendationQueryBuilder;
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

}