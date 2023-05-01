package com.leonardo.jikanwapper.records.anime;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.leonardo.jikanwapper.records.Broadcast;
import com.leonardo.jikanwapper.records.Generic;
import com.leonardo.jikanwapper.records.Trailer;
import com.leonardo.jikanwapper.records.aired.Aired;
import com.leonardo.jikanwapper.records.image.JpgWebImages;

import java.util.List;

public record Anime(
        @JsonAlias("mal_id")
        Integer malId,
        String url,
        Boolean approved,
        String title,
        @JsonAlias("title_english")
        String titleEnglish,
        @JsonAlias("title_japanese")
        String titleJapanese,
        @JsonAlias("title_synonyms")
        List<String> titleSynonyms,
        Boolean airing,
        String duration,
        String rating,
        Float score,
        @JsonAlias("scored_by")
        Integer scoredBy,
        Integer rank,
        Integer popularity,
        Integer members,
        Integer favorites,
        String synopsis,
        String background,
        String season,
        Integer year,
        String type,
        String source,
        Integer episodes,
        String status,
        Aired aired,
        JpgWebImages images,
        Trailer trailer,
        List<AnimeTitle> titles,
        Broadcast broadcast,
        List<Generic> producers,
        List<Generic> licensors,
        List<Generic> studios,
        List<AnimeGenre> genres,
        @JsonAlias("explicit_genres")
        List<AnimeGenre> explicitGenres,
        List<Generic> themes,
        List<Generic> demographics
) {
}
