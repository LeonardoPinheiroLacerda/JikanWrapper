package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.video.AnimeVideoEpisodeData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;

public class AnimeVideoEpisodesBuilder extends UrlBuilder implements RequestBuilder<AnimeVideoEpisodeData> {
    public AnimeVideoEpisodesBuilder(String url) {
        super(url);
    }

    public AnimeVideoEpisodesBuilder page(Integer page) {
        addQuery("page", page);
        return this;
    }

    @Override
    public Request<AnimeVideoEpisodeData> build() {
        return new Request(getUrl(), AnimeVideoEpisodeData.class);
    }
}
