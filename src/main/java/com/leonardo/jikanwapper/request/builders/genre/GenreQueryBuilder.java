package com.leonardo.jikanwapper.request.builders.genre;

import com.leonardo.jikanwapper.records.genres.GenreData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.query_enums.GenreQueryFilter;
import com.leonardo.jikanwapper.util.QueryParameterBuilder;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
@AllArgsConstructor
public class GenreQueryBuilder {

    private final String url;

    private Set<String> queries = new HashSet<>();

    public GenreQueryBuilder filter(GenreQueryFilter queryParameter) {
        this.queries.add(queryParameter.getQuery());
        return this;
    }

    public Request<GenreData> build() {
        return new Request(this.url + QueryParameterBuilder.build(queries), GenreData.class);
    }

}
