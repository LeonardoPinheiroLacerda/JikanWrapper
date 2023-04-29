package com.leonardo.jikanwapper.records;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Generic(
        @JsonAlias("mal_id")
        Integer malId,
        String type,
        String name,
        String url
) {
}
