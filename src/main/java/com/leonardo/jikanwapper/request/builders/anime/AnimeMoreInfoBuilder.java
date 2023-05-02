package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.moreinfo.AnimeMoreInfoData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;

public class AnimeMoreInfoBuilder extends UrlBuilder implements RequestBuilder<AnimeMoreInfoData> {
    public AnimeMoreInfoBuilder(String url) {
        super(url);
    }

    @Override
    public Request<AnimeMoreInfoData> build() {
        return new Request(getUrl(), AnimeMoreInfoData.class);
    }
}
