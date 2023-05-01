package com.leonardo.jikanwapper.request.builders.magazine;

import com.leonardo.jikanwapper.records.maganize.MagazineData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;
import com.leonardo.jikanwapper.request.query_enums.MagazinesQueryOrderBy;
import com.leonardo.jikanwapper.request.query_enums.SearchQuerySort;

public class MagazineBuilder extends UrlBuilder implements RequestBuilder<MagazineData> {

    public MagazineBuilder(String url) {
        super(url);
    }

    public MagazineBuilder page(Integer page) {
        addQuery("page", page);
        return this;
    }

    public MagazineBuilder limit(Integer limit) {
        addQuery("limit", limit);
        return this;
    }

    public MagazineBuilder query(String q) {
        addQuery("q", q);
        return this;
    }

    public MagazineBuilder letter(Character letter) {
        addQuery("letter", letter);
        return this;
    }

    public MagazineBuilder orderBy(MagazinesQueryOrderBy magazinesQueryOrderBy, SearchQuerySort searchQuerySort) {
        addQuery(magazinesQueryOrderBy.getQuery());
        addQuery(searchQuerySort.getQuery());
        return this;
    }

    @Override
    public Request<MagazineData> build() {
        return new Request(getUrl(), MagazineData.class);
    }

}
