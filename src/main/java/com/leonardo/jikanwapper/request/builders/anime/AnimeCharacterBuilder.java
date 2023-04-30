package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.character.AnimeCharacterData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;

public class AnimeCharacterBuilder extends UrlBuilder implements RequestBuilder<AnimeCharacterData> {

    public AnimeCharacterBuilder(String url) {
        super(url);
    }

    @Override
    public Request<AnimeCharacterData> build() {
        return new Request(getUrl(), AnimeCharacterData.class);
    }

}
