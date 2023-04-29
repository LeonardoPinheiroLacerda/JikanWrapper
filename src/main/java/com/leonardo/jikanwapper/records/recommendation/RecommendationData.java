package com.leonardo.jikanwapper.records.recommendation;

import com.leonardo.jikanwapper.records.pagination.Pagination;

import java.util.List;

public record RecommendationData(

        List<Recommendation> data,
        Pagination pagination
) {
}
