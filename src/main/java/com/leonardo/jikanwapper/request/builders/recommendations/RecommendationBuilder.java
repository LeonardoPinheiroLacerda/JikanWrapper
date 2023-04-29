package com.leonardo.jikanwapper.request.builders.recommendations;

import com.leonardo.jikanwapper.JikanConstants;

public class RecommendationBuilder {

    private String url = JikanConstants.HOST + JikanConstants.RECOMMENDATION_ENDPOINT + "";

    public RecommendationQueryBuilder anime() {
        return new RecommendationQueryBuilder(url + "/anime");
    }

    public RecommendationQueryBuilder manga() {
        return new RecommendationQueryBuilder(url + "/manga");
    }

}
