package com.leonardo.jikanwapper.records.anime.character;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record AnimeCharacter(
        AnimeCharacterCharacter character,
        String role,
        Integer favorites,
        @JsonAlias("voice_actors")
        List<AnimeCharacterVoiceActor> voiceActors
) {
}
