package com.leonardo.jikanwapper.records.anime.episode;

import com.fasterxml.jackson.annotation.JsonAlias;

public record AnimeEpisode (
        @JsonAlias("mal_id")
        Integer malId,
        String url,
        String title,
        @JsonAlias("title_japanese")
        String titleJapanese,
        @JsonAlias("title_romanji")
        String titleRomanji,
        Float duration,
        String aired,
        Boolean filler,
        Boolean recap,
        @JsonAlias("forum_url")
        String forumUrl,
        Float score

){
}
