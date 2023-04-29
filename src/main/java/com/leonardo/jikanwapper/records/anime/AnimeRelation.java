package com.leonardo.jikanwapper.records.anime;

import com.leonardo.jikanwapper.records.Generic;

import java.util.List;

public record AnimeRelation(
        String relation,
        List<Generic> entry
) {
}
