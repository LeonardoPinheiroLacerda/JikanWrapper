package com.leonardo.jikanwapper.request.query_enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AnimeSearchQueryOrderBy {

    MAL_ID("order_by=mal_id"),
    TITLE("order_by=title"),
    TYPE("order_by=type"),
    RATING("order_by=rating"),
    START_DATE("order_by=start_date"),
    END_DATE("order_by=end_date"),
    EPISODES("order_by=episodes"),
    SCORE("order_by=score"),
    SCORED_BY("order_by=scored_by"),
    RANK("order_by=rank"),
    POPULARITY("order_by=popularity"),
    MEMBERS("order_by=members"),
    FAVORITES("order_by=favorites");

    private final String query;
}
