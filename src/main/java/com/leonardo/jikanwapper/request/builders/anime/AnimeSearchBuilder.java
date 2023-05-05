package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.search.AnimeSearchData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

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

    public AnimeSearchBuilder genres(List<Integer> genresId) {
        addQuery(
                "genres",
                String.join(",",
                        genresId
                                .stream()
                                .map(item -> item.toString())
                                .collect(Collectors.toList())
                )
        );
        return this;
    }

    public AnimeSearchBuilder genresExclude(List<Integer> genresExcludeId) {
        addQuery(
                "genres_exclude",
                String.join(",",
                        genresExcludeId
                                .stream()
                                .map(item -> item.toString())
                                .collect(Collectors.toList())
                )
        );
        return this;
    }

    public AnimeSearchBuilder producers(List<Integer> producersId) {
        addQuery(
                "producers",
                String.join(",",
                        producersId
                                .stream()
                                .map(item -> item.toString())
                                .collect(Collectors.toList())
                )
        );
        return this;
    }

    @Override
    public Request<AnimeSearchData> build() {
        return new Request(getUrl(), AnimeSearchData.class);
    }
}
