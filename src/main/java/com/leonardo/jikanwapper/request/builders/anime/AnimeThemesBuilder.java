package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.themes.AnimeThemesData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;

public class AnimeThemesBuilder extends UrlBuilder implements RequestBuilder<AnimeThemesData> {
    public AnimeThemesBuilder(String url) {
        super(url);
    }

    @Override
    public Request<AnimeThemesData> build() {
        return new Request(getUrl(), AnimeThemesData.class);
    }
}
