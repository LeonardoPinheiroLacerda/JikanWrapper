package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.AnimeData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AnimeIdBuilder implements RequestBuilder<AnimeData> {

    private String url;

    @Override
    public Request<AnimeData> build() {
        return new Request(this.url, AnimeData.class);
    }
}
