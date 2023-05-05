package com.leonardo.jikanwapper.records.anime.review;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.anime.AnimeUser;

import java.time.LocalDateTime;
import java.util.List;

public record AnimeReview (

        @JsonAlias("mal_id")
        Integer malId,
        String url,
        String type,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = JikanConstants.DEFAULT_DATE_PATTERN, timezone = JikanConstants.DEFAULT_TIMEZONE)
        LocalDateTime date,
        String review,
        @JsonAlias("is_spoiler")
        Boolean isSpoiler,
        @JsonAlias("is_preliminary")
        Boolean isPreliminary,
        @JsonAlias("episodes_watched")
        Integer episodesWatched,
        Integer score,
        List<String> tags,
        AnimeReviewReactions reactions,
        AnimeUser user

){
}
