package com.leonardo.jikanwapper.records.anime.review;

import com.fasterxml.jackson.annotation.JsonAlias;

public record AnimeReviewReactions(
        Integer overall,
        Integer nice,
        @JsonAlias("love_it")
        Integer loveIt,
        Integer funny,
        Integer confusing,
        Integer informative,
        @JsonAlias("well_written")
        Integer wellWritten,
        Integer creative
) {
}
