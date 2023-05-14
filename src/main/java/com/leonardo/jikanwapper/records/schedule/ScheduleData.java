package com.leonardo.jikanwapper.records.schedule;

import com.leonardo.jikanwapper.records.anime.Anime;
import com.leonardo.jikanwapper.records.pagination.Pagination;

import java.util.List;

public record ScheduleData(

        List<Anime> data,
        Pagination pagination
) {
}
