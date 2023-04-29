package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.AnimeData;
import com.leonardo.jikanwapper.records.anime.full.AnimeFullData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AnimeFullBuilder implements RequestBuilder<AnimeFullData> {

    private String url;

    @Override
    public Request<AnimeFullData> build() {
        return new Request(this.url, AnimeFullData.class);
    }
}
