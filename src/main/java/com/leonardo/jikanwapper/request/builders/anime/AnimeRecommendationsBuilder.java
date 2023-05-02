package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.recommendations.AnimeRecommendationsData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;
import lombok.NonNull;

public class AnimeRecommendationsBuilder extends UrlBuilder implements RequestBuilder<AnimeRecommendationsData> {
    public AnimeRecommendationsBuilder(String url) {
        super(url);
    }

    @Override
    public Request<AnimeRecommendationsData> build() {
        return new Request(getUrl(), AnimeRecommendationsData.class);
    }
}
