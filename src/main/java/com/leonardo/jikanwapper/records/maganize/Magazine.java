package com.leonardo.jikanwapper.records.maganize;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Magazine(
        @JsonAlias("mal_id")
        Long malId,
        String name,
        String url,
        Integer count
) {
}
