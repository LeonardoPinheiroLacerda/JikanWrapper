package com.leonardo.jikanwapper.records.anime.video;

import com.leonardo.jikanwapper.records.pagination.Pagination;

import java.util.List;

public record AnimeVideoEpisodeData (

        List<AnimeVideoEpisode> data,
        Pagination pagination
){
}
