package com.leonardo.jikanwapper.request;

import com.leonardo.jikanwapper.util.QueryParameter;
import com.leonardo.jikanwapper.util.QueryParameterBuilder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
public abstract class UrlBuilder {
    @NonNull
    private String url;
    private Set<QueryParameter> queries = new HashSet<>();

    protected void addQuery(String expression) {
        this.queries.add(new QueryParameter(expression));
    }

    protected void addQuery(String key, Object value) {
        this.queries.add(new QueryParameter(key, value));
    }

    protected void addQuery(QueryParameter queryParameter) {
        this.queries.add(queryParameter);
    }

    public String getUrl() {
        return this.url + QueryParameterBuilder.build(this.queries);
    }
}
