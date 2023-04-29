package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.JikanConstants;

public class AnimeBuilder {

    private String url = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT;

    public AnimeIdBuilder id(Integer id){
        return new AnimeIdBuilder(url + "/" + id);
    }
}
