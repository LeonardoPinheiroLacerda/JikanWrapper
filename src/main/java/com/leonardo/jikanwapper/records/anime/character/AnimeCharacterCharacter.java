package com.leonardo.jikanwapper.records.anime.character;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.leonardo.jikanwapper.records.image.ImageSmall;
import com.leonardo.jikanwapper.records.image.JpgWebImages;
import com.leonardo.jikanwapper.records.image.JpgWebpImageSmall;

public record AnimeCharacterCharacter(

        @JsonAlias("mal_id")
        Integer malId,
        String url,
        String name,
        JpgWebpImageSmall images

) {
}
