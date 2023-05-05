package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.external.AnimeExternalData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;

public class AnimeExternalBuilder extends UrlBuilder implements RequestBuilder<AnimeExternalData> {
    public AnimeExternalBuilder(String url) {
        super(url);
    }

    @Override
    public Request<AnimeExternalData> build() {
        return new Request(getUrl(), AnimeExternalData.class);
    }
}
