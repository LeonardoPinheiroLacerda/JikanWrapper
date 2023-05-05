package com.leonardo.jikanwapper.records.anime.review;

import com.leonardo.jikanwapper.records.pagination.Pagination;

import java.util.List;

public record AnimeReviewData(

        List<AnimeReview> data,
        Pagination pagination
) {
}
