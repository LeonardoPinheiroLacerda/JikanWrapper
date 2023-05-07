package com.leonardo.jikanwapper.request.query_enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AnimeSearchQueryStatus {

    AIRING ("status=airing"),
    COMPLETE ("status=complete"),
    UPCOMING ("status=upcoming");

    private final String query;
}
