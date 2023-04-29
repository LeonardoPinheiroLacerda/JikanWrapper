package com.leonardo.jikanwapper.records.image;

import com.fasterxml.jackson.annotation.JsonAlias;

public record ImageFull(
        @JsonAlias("image_url")
        String imageUrl,
        @JsonAlias("small_image_url")
        String smallImageUrl,
        @JsonAlias("medium_image_url")
        String mediumImageUrl,
        @JsonAlias("large_image_url")
        String largeImageUrl,
        @JsonAlias("maximum_image_url")
        String maximumImageUrl
) {
}
