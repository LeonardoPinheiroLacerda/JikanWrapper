package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.episode.AnimeEpisode;
import com.leonardo.jikanwapper.records.anime.episode.AnimeEpisodeIdData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;

public class AnimeEpisodeIdBuilder extends UrlBuilder implements RequestBuilder<AnimeEpisodeIdData> {

    public AnimeEpisodeIdBuilder(String url) {
        super(url);
    }

    @Override
    public Request<AnimeEpisodeIdData> build() {
        return new Request(getUrl(), AnimeEpisodeIdData.class);
    }
}
