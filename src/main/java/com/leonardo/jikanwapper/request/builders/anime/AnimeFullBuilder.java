package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.full.AnimeFullData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;

public class AnimeFullBuilder extends UrlBuilder implements RequestBuilder<AnimeFullData> {

    public AnimeFullBuilder(String url) {
        super(url);
    }

    @Override
    public Request<AnimeFullData> build() {
        return new Request(this.url, AnimeFullData.class);
    }
}
