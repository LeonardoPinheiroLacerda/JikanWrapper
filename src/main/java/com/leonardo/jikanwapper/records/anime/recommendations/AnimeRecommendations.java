package com.leonardo.jikanwapper.records.anime.recommendations;

import com.leonardo.jikanwapper.records.recommendation.RecommendationEntry;

public record AnimeRecommendations(
        RecommendationEntry entry,
        String url,
        Integer votes
) {
}
