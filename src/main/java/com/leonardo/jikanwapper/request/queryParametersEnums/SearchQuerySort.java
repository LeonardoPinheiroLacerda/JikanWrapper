package com.leonardo.jikanwapper.request.queryParametersEnums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SearchQuerySort {

    ASC ("sort=asc"),
    DESC ("sort=desc");

    private final String query;

}
