package com.leonardo.jikanwapper.records.anime;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.leonardo.jikanwapper.records.image.JpgImageUrl;

public record AnimePerson(
        @JsonAlias("mal_id")
        Integer malId,
        String url,
        String name,
        JpgImageUrl images
) {
}
