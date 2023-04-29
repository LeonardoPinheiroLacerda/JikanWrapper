package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.AnimeData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;


public class AnimeIdBuilder extends UrlBuilder implements RequestBuilder<AnimeData> {

    public AnimeIdBuilder(String url) {
        super(url);
    }

    public AnimeFullBuilder full() {
        return new AnimeFullBuilder(this.url + "/full");
    }

    @Override
    public Request<AnimeData> build() {
        return new Request(this.url, AnimeData.class);
    }
}
