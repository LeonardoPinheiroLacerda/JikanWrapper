package com.leonardo.jikanwapper.request.magazine;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.maganize.MagazineData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.queryParametersEnums.MagazinesQueryOrderBy;
import com.leonardo.jikanwapper.request.queryParametersEnums.SearchQuerySort;
import com.leonardo.jikanwapper.util.QueryParameterBuilder;

import java.util.ArrayList;
import java.util.List;

public class MagazineBuilder {

    private String url = JikanConstants.HOST + "/magazines";

    private List<String> queries = new ArrayList();

    public MagazineBuilder addPageQueryParameter(Integer page) {
        queries.add("page=" + page);
        return this;
    }

    public MagazineBuilder addLimitQueryParameter(Integer limit) {
        queries.add("limit=" + limit);
        return this;
    }

    public MagazineBuilder addQQueryParameter(String q) {
        queries.add("q=" + q);
        return this;
    }

    public MagazineBuilder addLetterQueryParameter(Character letter) {
        queries.add("letter=" + letter);
        return this;
    }

    public MagazineBuilder addQueryParameter(MagazinesQueryOrderBy magazinesQueryOrderBy){
        queries.add(magazinesQueryOrderBy.getQuery());
        return this;
    }

    public MagazineBuilder addQueryParameter(SearchQuerySort searchQuerySort){
        queries.add(searchQuerySort.getQuery());
        return this;
    }

    public Request<MagazineData> build() {
        return new Request(this.url + QueryParameterBuilder.build(queries), MagazineData.class);
    }

}
