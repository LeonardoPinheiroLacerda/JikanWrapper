package com.leonardo.jikanwapper.request.builders.recommendations;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.recommendation.RecommendationData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.builders.genre.GenreQueryBuilder;

public class RecommendationBuilder {

    private String url = JikanConstants.HOST + "/recommendations";

    public RecommendationQueryBuilder anime() {
        return new RecommendationQueryBuilder(url + "/anime");
    }

    public RecommendationQueryBuilder manga() {
        return new RecommendationQueryBuilder(url + "/manga");
    }

}
