package com.leonardo.jikanwapper.records.anime.news;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.leonardo.jikanwapper.records.pagination.Pagination;

import java.util.List;

public record AnimeNewsData (
    List<AnimeNews> data,
    Pagination pagination
){
}
