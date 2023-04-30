package com.leonardo.jikanwapper.records.image;

import com.fasterxml.jackson.annotation.JsonAlias;

public record ImageUrl(
        @JsonAlias("image_url")
        String imageUrl
) {
}
