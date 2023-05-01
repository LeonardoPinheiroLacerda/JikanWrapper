package com.leonardo.jikanwapper.records.anime.news;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.leonardo.jikanwapper.records.image.JpgImageUrl;

public record AnimeNews(
        @JsonAlias("mal_id")
        Integer malId,
        String url,
        String title,
        String date,
        @JsonAlias("author_username")
        String authorUsername,
        @JsonAlias("author_url")
        String authorUrl,
        @JsonAlias("forum_url")
        String forumUrl,
        JpgImageUrl images,
        Integer comments,
        String excerpt
) {
}
