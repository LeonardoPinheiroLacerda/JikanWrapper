package com.leonardo.jikanwapper.records.image;

import com.fasterxml.jackson.annotation.JsonAlias;

public record ImageSmall(
        @JsonAlias("image_url")
        String imageUrl,
        @JsonAlias("small_image_url")
        String smallImageUrl
) {
}
