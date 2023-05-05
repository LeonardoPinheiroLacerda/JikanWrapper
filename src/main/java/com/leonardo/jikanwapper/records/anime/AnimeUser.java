package com.leonardo.jikanwapper.records.anime;

import com.leonardo.jikanwapper.records.image.JpgWebpImageUrl;

public record AnimeUser(
        String username,
        String url,
        JpgWebpImageUrl images
) {
}
