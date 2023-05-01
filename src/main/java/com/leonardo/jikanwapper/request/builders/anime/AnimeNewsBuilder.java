package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.news.AnimeNewsData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;

public class AnimeNewsBuilder extends UrlBuilder implements RequestBuilder<AnimeNewsData> {

    public AnimeNewsBuilder(String url) {
        super(url);
    }

    public AnimeNewsBuilder page(Integer page) {
        addQuery("page", page);
        return this;
    }

    @Override
    public Request<AnimeNewsData> build() {
        return new Request(getUrl(), AnimeNewsData.class);
    }
}
