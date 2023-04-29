package com.leonardo.jikanwapper.records.recommendation;

import com.fasterxml.jackson.annotation.JsonAlias;

public record RecommendationEntry(
        @JsonAlias("mal_id")
        Integer malId,
        String url,
        String title,
        RecommendationImages images

) {
}
