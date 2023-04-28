package com.leonardo.jikanwapper.records.pagination;

import com.fasterxml.jackson.annotation.JsonAlias;

public record PaginationItems(
        Integer count,
        Integer total,
        @JsonAlias("per_page")
        Integer perPage
) {
}
