package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.search.AnimeSearchData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;

public class AnimeSearchBuilder extends UrlBuilder implements RequestBuilder<AnimeSearchData> {
    public AnimeSearchBuilder(String url) {
        super(url);
    }

    @Override
    public Request<AnimeSearchData> build() {
        return new Request(getUrl(), AnimeSearchData.class);
    }
}
