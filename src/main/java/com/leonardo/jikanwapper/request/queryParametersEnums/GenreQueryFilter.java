package com.leonardo.jikanwapper.request.queryParametersEnums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum GenreQueryFilter {

    GENRES("filter=genres"),
    EXPLICIT_GENRES("filter=explicit_genres"),
    THEMES("filter=themes"),
    DEMOGRAPHICS("filter=demographics");

    private String query;

}
