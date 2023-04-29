package com.leonardo.jikanwapper.records;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.leonardo.jikanwapper.records.image.ImageFull;

public record Trailer(
        @JsonAlias("youtube_id")
        String youtubeId,
        String url,
        @JsonAlias("embed_url")
        String embedUrl,

        ImageFull images


) {
}
