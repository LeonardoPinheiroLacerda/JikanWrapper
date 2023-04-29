package com.leonardo.jikanwapper.request;

import com.leonardo.jikanwapper.util.QueryParameter;
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
    protected String url;
    protected Set<QueryParameter> queries = new HashSet<>();
}
