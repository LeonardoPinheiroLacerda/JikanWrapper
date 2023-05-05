package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.search.AnimeSearchData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;

import java.time.LocalDate;

public class AnimeSearchBuilder extends UrlBuilder implements RequestBuilder<AnimeSearchData> {
    public AnimeSearchBuilder(String url) {
        super(url);
    }

    public AnimeSearchBuilder page(Integer page) {
        addQuery("page", page);
        return this;
    }

    public AnimeSearchBuilder limit(Integer limit) {
        addQuery("limit", limit);
        return this;
    }

    public AnimeSearchBuilder q(String q) {
        addQuery("q", q);
        return this;
    }

    public AnimeSearchBuilder minScore(Float minScore) {
        addQuery("min_score", minScore);
        return this;
    }

    public AnimeSearchBuilder maxScore(Float maxScore) {
        addQuery("max_score", maxScore);
        return this;
    }

    public AnimeSearchBuilder letter(Character letter) {
        addQuery("letter", letter);
        return this;
    }

    public AnimeSearchBuilder startDate(LocalDate startDate) {
        addQuery("start_date", startDate);
        return this;
    }

    public AnimeSearchBuilder endDate(LocalDate endDate) {
        addQuery("end_date", endDate);
        return this;
    }

    @Override
    public Request<AnimeSearchData> build() {
        return new Request(getUrl(), AnimeSearchData.class);
    }
}
