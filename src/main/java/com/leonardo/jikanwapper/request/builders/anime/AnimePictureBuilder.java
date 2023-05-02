package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.pictures.AnimePictureData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;

public class AnimePictureBuilder extends UrlBuilder implements RequestBuilder<AnimePictureData> {

    public AnimePictureBuilder(String url) {
        super(url);
    }

    @Override
    public Request<AnimePictureData> build() {
        return new Request(getUrl(), AnimePictureData.class);
    }
}
