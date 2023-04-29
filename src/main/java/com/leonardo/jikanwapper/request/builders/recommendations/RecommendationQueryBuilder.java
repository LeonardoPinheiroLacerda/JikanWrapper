package com.leonardo.jikanwapper.request.builders.recommendations;

import com.leonardo.jikanwapper.records.recommendation.RecommendationData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;
import com.leonardo.jikanwapper.util.QueryParameter;
import com.leonardo.jikanwapper.util.QueryParameterBuilder;

public class RecommendationQueryBuilder extends UrlBuilder implements RequestBuilder<RecommendationData> {

    public RecommendationQueryBuilder(String url) {
        super(url);
    }

    public RecommendationQueryBuilder page(Integer page) {
        queries.add(new QueryParameter("page", page));
        return this;
    }

    @Override
    public Request<RecommendationData> build() {
        return new Request(this.url + QueryParameterBuilder.build(queries), RecommendationData.class);
    }
}
