package com.leonardo.jikanwapper.records.recommendation;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.leonardo.jikanwapper.records.image.JpgWebImages;

public record RecommendationEntry(
        @JsonAlias("mal_id")
        Integer malId,
        String url,
        String title,
        JpgWebImages images

) {
}
