package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.forum.AnimeForumData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;
import com.leonardo.jikanwapper.request.query_enums.FilterTopics;

public class AnimeForumBuilder extends UrlBuilder implements RequestBuilder<AnimeForumData> {
    public AnimeForumBuilder(String url) {
        super(url);
    }

    public AnimeForumBuilder filter(FilterTopics filterTopics) {
        addQuery(filterTopics.getQuery());
        return this;
    }

    @Override
    public Request<AnimeForumData> build() {
        return new Request(getUrl(), AnimeForumData.class);
    }
}
