package com.leonardo.jikanwapper.request.builders.genre;

import com.leonardo.jikanwapper.records.genres.GenreData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;
import com.leonardo.jikanwapper.request.query_enums.GenreQueryFilter;

public class GenreQueryBuilder extends UrlBuilder implements RequestBuilder<GenreData> {

    public GenreQueryBuilder(String url) {
        super(url);
    }

    public GenreQueryBuilder filter(GenreQueryFilter queryParameter) {
        addQuery(queryParameter.getQuery());
        return this;
    }

    @Override
    public Request<GenreData> build() {
        return new Request(getUrl(), GenreData.class);
    }

}
