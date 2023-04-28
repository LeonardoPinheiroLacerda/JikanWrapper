package com.leonardo.jikanwapper.request.query_enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SearchQuerySort {

    ASC ("sort=asc"),
    DESC ("sort=desc");

    private final String query;

}
