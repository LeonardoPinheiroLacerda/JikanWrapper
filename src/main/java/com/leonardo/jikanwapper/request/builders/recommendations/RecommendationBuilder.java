package com.leonardo.jikanwapper.request.builders.recommendations;

import com.leonardo.jikanwapper.request.UrlBuilder;

public class RecommendationBuilder extends UrlBuilder {

    public RecommendationBuilder(String url) {
        super(url);
    }

    public RecommendationQueryBuilder anime() {
        return new RecommendationQueryBuilder(url + "/anime");
    }

    public RecommendationQueryBuilder manga() {
        return new RecommendationQueryBuilder(url + "/manga");
    }

}
