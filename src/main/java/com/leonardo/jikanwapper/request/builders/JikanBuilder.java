package com.leonardo.jikanwapper.request.builders;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.request.builders.anime.AnimeBuilder;
import com.leonardo.jikanwapper.request.builders.genre.GenreBuilder;
import com.leonardo.jikanwapper.request.builders.magazine.MagazineBuilder;
import com.leonardo.jikanwapper.request.builders.recommendations.RecommendationBuilder;
import com.leonardo.jikanwapper.request.builders.schedule.ScheduleBuilder;

public class JikanBuilder {

    public static GenreBuilder genre() {
        return new GenreBuilder(JikanConstants.HOST + JikanConstants.GENRE_ENDPOINT);
    }

    public static MagazineBuilder magazine() {
        return new MagazineBuilder(JikanConstants.HOST + JikanConstants.MAGAZINE_ENDPOINT);
    }

    public static RecommendationBuilder recommendations() {
        return new RecommendationBuilder(JikanConstants.HOST + JikanConstants.RECOMMENDATION_ENDPOINT);
    }

    public static AnimeBuilder anime() {
        return new AnimeBuilder(JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT);
    }

    public static ScheduleBuilder schedule() {
        return new ScheduleBuilder(JikanConstants.HOST + JikanConstants.SCHEDULE_ENDPOINT);
    }

}
