package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.streaming.AnimeStreamingData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;

public class AnimeStreamingBuilder extends UrlBuilder implements RequestBuilder<AnimeStreamingData> {
    public AnimeStreamingBuilder(String url) {
        super(url);
    }

    @Override
    public Request<AnimeStreamingData> build() {
        return new Request(getUrl(), AnimeStreamingData.class);
    }
}
