package com.leonardo.jikanwapper.records.anime.statistics;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record AnimeStatistics(

        Integer watching,
        Integer completed,
        @JsonAlias("on_hold")
        Integer onHold,
        Integer dropped,
        @JsonAlias("plan_to_watch")
        Integer planToWatch,
        Integer total,
        List<AnimeStatisticsScore> scores

) {
}
