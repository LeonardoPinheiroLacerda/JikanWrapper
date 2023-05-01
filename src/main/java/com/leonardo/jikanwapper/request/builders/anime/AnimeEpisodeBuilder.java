package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.episode.AnimeEpisodeData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;
import com.leonardo.jikanwapper.util.QueryParameterBuilder;

public class AnimeEpisodeBuilder extends UrlBuilder implements RequestBuilder<AnimeEpisodeData> {

    public AnimeEpisodeBuilder(String url) {
        super(url);
    }

    public AnimeEpisodeIdBuilder id(Integer id) {
        return new AnimeEpisodeIdBuilder(getUrl() + "/" + id);
    }

    public AnimeEpisodeBuilder page(Integer page) {
        addQuery("page", page);
        return this;
    }

    @Override
    public Request<AnimeEpisodeData> build() {
        return new Request(getUrl() + QueryParameterBuilder.build(getQueries()), AnimeEpisodeData.class);
    }
}
