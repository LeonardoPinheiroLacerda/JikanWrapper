package com.leonardo.jikanwapper.records.maganize;

import com.leonardo.jikanwapper.records.pagination.Pagination;

import java.util.List;

public record MagazineData(
        List<Magazine> data,
        Pagination pagination
) {
}
