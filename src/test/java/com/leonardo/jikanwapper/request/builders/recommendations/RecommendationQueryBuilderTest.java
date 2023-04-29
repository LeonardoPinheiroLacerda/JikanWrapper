package com.leonardo.jikanwapper.request.builders.recommendations;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.recommendation.RecommendationData;
import com.leonardo.jikanwapper.util.QueryParameter;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecommendationQueryBuilderTest {

    @Test
    @DisplayName("Should build a request for recommendations")
    void buildTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.RECOMMENDATION_ENDPOINT + "/anime";

        //when
        RecommendationQueryBuilder recommendationQueryBuilder = JikanBuilder.recommendations().anime();
        Request<RecommendationData> actual = recommendationQueryBuilder.build();

        //then
        assertNotNull(actual);
        assertEquals(expected, actual.toString());

    }

    @Test
    @DisplayName("Should add page query parameter")
    void filterTest() {

        //when
        RecommendationQueryBuilder actual = JikanBuilder
                .recommendations()
                .anime()
                .page(1);

        //then
        assertNotNull(actual);
        assertTrue(actual.getQueries().contains(new QueryParameter("page=1")));

    }

}