package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.request.UrlBuilder;

public class AnimeBuilder extends UrlBuilder {

    public AnimeBuilder(String url) {
        super(url);
    }

    public AnimeIdBuilder id(Integer id){
        return new AnimeIdBuilder(getUrl() + "/" + id);
    }

    public AnimeSearchBuilder search() {
        return new AnimeSearchBuilder(getUrl());
    }
}
