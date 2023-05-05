package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.review.AnimeReviewData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;

public class AnimeReviewBuilder extends UrlBuilder implements RequestBuilder<AnimeReviewData> {
    public AnimeReviewBuilder(String url) {
        super(url);
    }

    public AnimeReviewBuilder page(Integer page) {
        addQuery("page", page);
        return this;
    }
    @Override
    public Request<AnimeReviewData> build() {
        return new Request(getUrl(), AnimeReviewData.class);
    }
}
