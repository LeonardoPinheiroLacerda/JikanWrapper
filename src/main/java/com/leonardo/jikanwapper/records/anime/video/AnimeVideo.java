package com.leonardo.jikanwapper.records.anime.video;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record AnimeVideo(
        List<AnimeVideoPromo> promo,
        List<AnimeVideoEpisode> episodes,
        @JsonAlias("music_videos")
        List<AnimeVideoMusicVideo> musicVideos
) {
}
