package com.leonardo.jikanwapper.request.builders.recommendations;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.request.builders.genre.GenreBuilder;
import com.leonardo.jikanwapper.request.builders.genre.GenreQueryBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecommendationBuilderTest {

    @Test
    @DisplayName("Should return RecommendationQueryBuilder with the url for anime")
    void anime() {

        //given
        String expected = JikanConstants.HOST + "/recommendations/anime";

        //when
        RecommendationBuilder recommendationBuilder = new RecommendationBuilder();

        RecommendationQueryBuilder recommendationQueryBuilder = recommendationBuilder.anime();

        String actual = recommendationQueryBuilder.getUrl();

        //then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should return RecommendationQueryBuilder with the url for manga")
    void manga() {
        //given
        String expected = JikanConstants.HOST + "/recommendations/manga";

        //when
        RecommendationBuilder recommendationBuilder = new RecommendationBuilder();

        RecommendationQueryBuilder recommendationQueryBuilder = recommendationBuilder.manga();

        String actual = recommendationQueryBuilder.getUrl();

        //then
        assertEquals(expected, actual);
    }
}