package com.leonardo.jikanwapper.request.builders.recommendations;

import com.leonardo.jikanwapper.records.recommendation.RecommendationData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.util.QueryParameter;
import com.leonardo.jikanwapper.util.QueryParameterBuilder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
@Getter
public class RecommendationQueryBuilder implements RequestBuilder<RecommendationData> {

    private final String url;

    private Set<QueryParameter> queries = new HashSet<>();

    public RecommendationQueryBuilder page(Integer page) {
        queries.add(new QueryParameter("page", page));
        return this;
    }

    @Override
    public Request<RecommendationData> build() {
        return new Request(this.url + QueryParameterBuilder.build(queries), RecommendationData.class);
    }
}
