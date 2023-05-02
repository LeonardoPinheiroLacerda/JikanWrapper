package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.statistics.AnimeStatisticsData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;

public class AnimeStatisticsBuilder extends UrlBuilder implements RequestBuilder<AnimeStatisticsData> {
    public AnimeStatisticsBuilder(String url) {
        super(url);
    }

    @Override
    public Request<AnimeStatisticsData> build() {
        return new Request(getUrl(), AnimeStatisticsData.class);
    }
}
