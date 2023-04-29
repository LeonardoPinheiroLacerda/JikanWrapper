package com.leonardo.jikanwapper.request.builders.magazine;

import com.leonardo.jikanwapper.records.maganize.MagazineData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;
import com.leonardo.jikanwapper.request.query_enums.MagazinesQueryOrderBy;
import com.leonardo.jikanwapper.request.query_enums.SearchQuerySort;
import com.leonardo.jikanwapper.util.QueryParameter;
import com.leonardo.jikanwapper.util.QueryParameterBuilder;


public class MagazineBuilder extends UrlBuilder implements RequestBuilder<MagazineData> {

    public MagazineBuilder(String url) {
        super(url);
    }

    public MagazineBuilder page(Integer page) {
        queries.add(new QueryParameter("page", page));
        return this;
    }

    public MagazineBuilder limit(Integer limit) {
        queries.add(new QueryParameter("limit", limit));
        return this;
    }

    public MagazineBuilder query(String q) {
        queries.add(new QueryParameter("q", q));
        return this;
    }

    public MagazineBuilder letter(Character letter) {
        queries.add(new QueryParameter("letter", letter));
        return this;
    }

    public MagazineBuilder orderBy(MagazinesQueryOrderBy magazinesQueryOrderBy, SearchQuerySort searchQuerySort) {
        queries.add(new QueryParameter(magazinesQueryOrderBy.getQuery()));
        queries.add(new QueryParameter(searchQuerySort.getQuery()));
        return this;
    }

    @Override
    public Request<MagazineData> build() {
        return new Request(this.url + QueryParameterBuilder.build(queries), MagazineData.class);
    }

}
