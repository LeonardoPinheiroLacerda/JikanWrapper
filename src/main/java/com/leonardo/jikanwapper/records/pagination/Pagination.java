package com.leonardo.jikanwapper.records.pagination;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Pagination(
    @JsonAlias("last_visible_page")
    Integer lastVisiblePage,
    @JsonAlias("has_next_page")
    Boolean hasNextPage,
    @JsonAlias("current_page")
    Integer currentPage,
    PaginationItems items
) {
}
