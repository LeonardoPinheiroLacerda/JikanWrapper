package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.relations.AnimeRelationsData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;

public class AnimeRelationsBuilder extends UrlBuilder implements RequestBuilder<AnimeRelationsData> {
    public AnimeRelationsBuilder(String url) {
        super(url);
    }

    @Override
    public Request<AnimeRelationsData> build() {
        return new Request(getUrl(), AnimeRelationsData.class);
    }
}
