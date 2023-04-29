package com.leonardo.jikanwapper.records.anime;

import com.fasterxml.jackson.annotation.JsonAlias;

public record AnimeGenre(
        @JsonAlias("mal_id")
        Integer malId,
        String type,
        String name,
        String url
) {
}
