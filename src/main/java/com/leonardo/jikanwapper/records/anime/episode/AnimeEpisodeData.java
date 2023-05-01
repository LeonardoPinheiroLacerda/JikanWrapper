package com.leonardo.jikanwapper.records.anime.episode;

import com.leonardo.jikanwapper.records.pagination.Pagination;

import java.util.List;

public record AnimeEpisodeData (

        List<AnimeEpisode> data,
        Pagination pagination


){
}
