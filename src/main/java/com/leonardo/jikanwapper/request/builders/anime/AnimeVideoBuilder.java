package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.video.AnimeVideoData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;

public class AnimeVideoBuilder extends UrlBuilder implements RequestBuilder<AnimeVideoData> {

    public AnimeVideoBuilder(String url){
        super(url);
    }

    @Override
    public Request<AnimeVideoData> build() {
        return new Request(getUrl(), AnimeVideoData.class);
    }
}
