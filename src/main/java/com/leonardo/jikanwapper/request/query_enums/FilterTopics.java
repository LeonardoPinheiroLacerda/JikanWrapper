package com.leonardo.jikanwapper.request.query_enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FilterTopics {

    ALL("filter=all"),
    EPISODE("filter=episode"),
    OTHER("filter=other");

    private final String query;
}
