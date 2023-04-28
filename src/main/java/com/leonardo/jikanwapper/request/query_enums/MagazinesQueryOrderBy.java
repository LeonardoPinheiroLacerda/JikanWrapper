package com.leonardo.jikanwapper.request.query_enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MagazinesQueryOrderBy {

    MAL_ID ("order_by=mal_id"),
    NAME ("order_by=name"),
    COUNT ("order_by=count");

    private final String query;
}
