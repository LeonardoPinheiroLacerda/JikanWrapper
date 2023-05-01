package com.leonardo.jikanwapper.records.anime.video;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.leonardo.jikanwapper.records.image.ImageFull;

public record AnimeVideoVideo (
        @JsonAlias("youtube_id")
        String youtubeId,
        String url,
        @JsonAlias("embed_url")
        String embedUrl,
        ImageFull images
){
}
