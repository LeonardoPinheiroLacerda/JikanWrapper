package com.leonardo.jikanwapper.request.genre;

import com.leonardo.jikanwapper.records.genres.GenreData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.queryParametersEnums.GenreQueryFilter;
import com.leonardo.jikanwapper.util.QueryParameterBuilder;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@AllArgsConstructor
public class GenreQueryBuilder {

    private final String url;

    private List<String> queries = new ArrayList();

    public GenreQueryBuilder addQueryParameter(GenreQueryFilter queryParameter) {
        this.queries.add(queryParameter.getQuery());
        return this;
    }

    public Request<GenreData> build() {
        return new Request(this.url + QueryParameterBuilder.build(queries), GenreData.class);
    }

}
