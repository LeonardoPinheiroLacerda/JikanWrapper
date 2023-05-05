package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.AnimeData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;


public class AnimeIdBuilder extends UrlBuilder implements RequestBuilder<AnimeData> {

    public AnimeIdBuilder(String url) {
        super(url);
    }

    public AnimeFullBuilder full() {
        return new AnimeFullBuilder(getUrl() + "/full");
    }

    public AnimeCharacterBuilder character() {
        return new AnimeCharacterBuilder(getUrl() + "/characters");
    }

    public AnimeStaffBuilder staff() {
        return new AnimeStaffBuilder(getUrl() + "/staff");
    }

    public AnimeEpisodeBuilder episodes() {
        return new AnimeEpisodeBuilder(getUrl() + "/episodes");
    }

    public AnimeForumBuilder forum() {
        return new AnimeForumBuilder(getUrl() + "/forum");
    }

    public AnimeNewsBuilder news() {
        return new AnimeNewsBuilder(getUrl() + "/news");
    }

    public AnimeVideoBuilder videos() {
        return new AnimeVideoBuilder(getUrl() + "/videos");
    }

    public AnimePictureBuilder pictures() {
        return new AnimePictureBuilder(getUrl() + "/pictures");
    }

    public AnimeStatisticsBuilder statistics() {
        return new AnimeStatisticsBuilder(getUrl() + "/statistics");
    }

    public AnimeMoreInfoBuilder moreInfo() {
        return new AnimeMoreInfoBuilder(getUrl() + "/moreinfo");
    }

    public AnimeRecommendationsBuilder recommendations() {
        return new AnimeRecommendationsBuilder(getUrl() + "/recommendations");
    }

    public AnimeReviewBuilder reviews() {
        return new AnimeReviewBuilder(getUrl() + "/reviews");
    }

    public AnimeRelationsBuilder relations() {
        return new AnimeRelationsBuilder(getUrl() + "/relations");
    }

    public AnimeThemesBuilder themes() {
        return new AnimeThemesBuilder(getUrl() + "/themes");
    }

    public AnimeExternalBuilder external() {
        return new AnimeExternalBuilder(getUrl() + "/external");
    }

    public AnimeStreamingBuilder streaming() {
        return new AnimeStreamingBuilder(getUrl() + "/streaming");
    }

    @Override
    public Request<AnimeData> build() {
        return new Request(getUrl(), AnimeData.class);
    }
}
