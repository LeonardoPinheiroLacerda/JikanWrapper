package com.leonardo.jikanwapper.records.anime.forum;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.leonardo.jikanwapper.JikanConstants;

import java.time.LocalDateTime;

public record AnimeForum (
        @JsonAlias("mal_id")
        Integer malId,
        String url,
        String title,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = JikanConstants.DEFAULT_DATE_PATTERN, timezone = JikanConstants.DEFAULT_TIMEZONE)
        LocalDateTime date,
        @JsonAlias("author_username")
        String authorUsername,
        @JsonAlias("author_url")
        String authorUrl,
        Integer comments,
        @JsonAlias("last_comment")
        AnimeForumLastComment lastComment
){
}
