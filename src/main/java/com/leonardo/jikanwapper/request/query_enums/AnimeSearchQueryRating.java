package com.leonardo.jikanwapper.request.query_enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AnimeSearchQueryRating {
    G("rating=g", "G - All Ages"),
    PG("rating=pg", "PG - Children"),
    PG13("rating=pg13", "PG-13 - Teens 13 or older"),
    R17("rating=r17", "R - 17+ (violence & profanity)"),
    R("rating=r", "R+ - Mild Nudity"),
    RX("rating=rx", "Rx - Hentai");

    private final String query;
    private final String friendlyName;

}
