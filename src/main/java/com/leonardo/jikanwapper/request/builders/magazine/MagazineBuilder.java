package com.leonardo.jikanwapper.request.builders.magazine;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.maganize.MagazineData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.query_enums.MagazinesQueryOrderBy;
import com.leonardo.jikanwapper.request.query_enums.SearchQuerySort;
import com.leonardo.jikanwapper.util.QueryParameterBuilder;

import java.util.HashSet;
import java.util.Set;

public class MagazineBuilder {

    private String url = JikanConstants.HOST + "/magazines";

    private Set<String> queries = new HashSet<>();

    public MagazineBuilder page(Integer page) {
        queries.add("page=" + page);
        return this;
    }

    public MagazineBuilder limit(Integer limit) {
        queries.add("limit=" + limit);
        return this;
    }

    public MagazineBuilder query(String q) {
        queries.add("q=" + q);
        return this;
    }

    public MagazineBuilder letter(Character letter) {
        queries.add("letter=" + letter);
        return this;
    }

    public MagazineBuilder orderBy(MagazinesQueryOrderBy magazinesQueryOrderBy, SearchQuerySort searchQuerySort){
        queries.add(magazinesQueryOrderBy.getQuery());
        queries.add(searchQuerySort.getQuery());
        return this;
    }

    public Request<MagazineData> build() {
        return new Request(this.url + QueryParameterBuilder.build(queries), MagazineData.class);
    }

}
