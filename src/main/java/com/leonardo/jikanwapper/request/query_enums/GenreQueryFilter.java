package com.leonardo.jikanwapper.request.query_enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum GenreQueryFilter {

    GENRES ("filter=genres"),
    EXPLICIT_GENRES ("filter=explicit_genres"),
    THEMES ("filter=themes"),
    DEMOGRAPHICS ("filter=demographics");

    private final String query;

}
