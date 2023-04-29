package com.leonardo.jikanwapper.request.builders.magazine;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.maganize.MagazineData;
import com.leonardo.jikanwapper.util.QueryParameter;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.query_enums.MagazinesQueryOrderBy;
import com.leonardo.jikanwapper.request.query_enums.SearchQuerySort;
import com.leonardo.jikanwapper.util.QueryParameterBuilder;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;


@Getter
public class MagazineBuilder {

    private String url = JikanConstants.HOST + JikanConstants.MAGAZINE_ENDPOINT + "";

    private Set<QueryParameter> queries = new HashSet<>();

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

    public MagazineBuilder orderBy(MagazinesQueryOrderBy magazinesQueryOrderBy, SearchQuerySort searchQuerySort){
        queries.add(new QueryParameter(magazinesQueryOrderBy.getQuery()));
        queries.add(new QueryParameter(searchQuerySort.getQuery()));
        return this;
    }

    public Request<MagazineData> build() {
        return new Request(this.url + QueryParameterBuilder.build(queries), MagazineData.class);
    }

}
