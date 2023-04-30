package com.leonardo.jikanwapper.records.anime.character;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.leonardo.jikanwapper.records.image.JpgImageUrl;

public record AnimeCharacterVoiceActorPerson(
        @JsonAlias("mal_id")
        Integer malId,
        String url,
        String name,
        JpgImageUrl images
) {
}
