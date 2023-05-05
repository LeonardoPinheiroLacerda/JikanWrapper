package com.leonardo.jikanwapper.records.anime.search;

import com.leonardo.jikanwapper.records.anime.Anime;
import com.leonardo.jikanwapper.records.pagination.Pagination;

import java.util.List;

public record AnimeSearchData(
        List<Anime> data,
        Pagination pagination

) {
}
