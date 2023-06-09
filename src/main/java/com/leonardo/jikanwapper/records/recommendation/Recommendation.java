package com.leonardo.jikanwapper.records.recommendation;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.User;

import java.time.LocalDateTime;
import java.util.List;

public record Recommendation(
        @JsonAlias("mal_id")
        String malId,
        String content,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = JikanConstants.DEFAULT_DATE_PATTERN, timezone = JikanConstants.DEFAULT_TIMEZONE)
        LocalDateTime date,

        List<RecommendationEntry> entry,

        User user

) {
}
