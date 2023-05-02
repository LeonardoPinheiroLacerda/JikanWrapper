package com.leonardo.jikanwapper.records.anime.moreinfo;

import com.fasterxml.jackson.annotation.JsonAlias;

public record AnimeMoreInfo(
        @JsonAlias("moreinfo")
        String moreInfo
) {
}
