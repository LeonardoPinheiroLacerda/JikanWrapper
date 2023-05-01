package com.leonardo.jikanwapper.records.anime.video;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.leonardo.jikanwapper.records.image.JpgImageUrl;

public record AnimeVideoEpisode(
        @JsonAlias("mal_id")
        Integer malId,
        String url,
        String title,
        String episode,
        JpgImageUrl images
){
}
