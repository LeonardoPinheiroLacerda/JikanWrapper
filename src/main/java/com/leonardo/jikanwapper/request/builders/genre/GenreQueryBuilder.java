package com.leonardo.jikanwapper.request.builders.genre;

import com.leonardo.jikanwapper.records.genres.GenreData;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.util.QueryParameter;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.query_enums.GenreQueryFilter;
import com.leonardo.jikanwapper.util.QueryParameterBuilder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
public class GenreQueryBuilder implements RequestBuilder<GenreData> {

    private final String url;

    private Set<QueryParameter> queries = new HashSet<>();

    public GenreQueryBuilder filter(GenreQueryFilter queryParameter) {
        this.queries.add(new QueryParameter(queryParameter.getQuery()));
        return this;
    }

    @Override
    public Request<GenreData> build() {
        return new Request(this.url + QueryParameterBuilder.build(queries), GenreData.class);
    }

}
