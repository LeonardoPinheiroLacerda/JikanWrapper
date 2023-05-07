package com.leonardo.jikanwapper.request.query_enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AnimeSearchQueryType {

    TV ("type=tv"),
    MOVIE ("type=movie"),
    OVA ("type=ova"),
    SPECIAL ("type=special"),
    ONA ("type=ona"),
    MUSIC ("type=music");

    private final String query;
}
