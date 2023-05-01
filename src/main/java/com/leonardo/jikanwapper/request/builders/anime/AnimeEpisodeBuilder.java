package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.episode.AnimeEpisodeData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;

public class AnimeEpisodeBuilder extends UrlBuilder implements RequestBuilder<AnimeEpisodeData> {

    public AnimeEpisodeBuilder(String url) {
        super(url);
    }

    @Override
    public Request<AnimeEpisodeData> build() {
        return new Request(getUrl(), AnimeEpisodeData.class);
    }
}
