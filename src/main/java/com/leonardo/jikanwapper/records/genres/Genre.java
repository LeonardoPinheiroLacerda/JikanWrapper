package com.leonardo.jikanwapper.records.genres;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Genre(
        @JsonAlias("mal_id")
        Long malId,
        String name,
        String url,
        Integer count
) {
}
