package com.leonardo.jikanwapper.request;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.request.builders.anime.AnimeBuilder;
import com.leonardo.jikanwapper.util.QueryParameter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UrlBuilderTest {

    @Test
    @DisplayName("Should add query using string expression as argument")
    void addQueryTest() {
        //given
        String expression = "page=1";

        //when
        AnimeBuilder urlBuilder = new AnimeBuilder(JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT);
        urlBuilder.addQuery(expression);
        Set<QueryParameter> queries = urlBuilder.getQueries();

        QueryParameter query = queries.stream().findFirst().get();

        //then
        assertNotNull(query);
        assertEquals("page", query.getKey());
        assertEquals("1", query.getValue());

    }

    @Test
    @DisplayName("Should add query using String key and Object value as argument")
    void addQuery1Test() {
        //given
        String key = "page";
        Integer value = 1;

        //when
        AnimeBuilder urlBuilder = new AnimeBuilder(JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT);
        urlBuilder.addQuery(key, value);
        Set<QueryParameter> queries = urlBuilder.getQueries();

        QueryParameter query = queries.stream().findFirst().get();

        //then
        assertNotNull(query);
        assertEquals("page", query.getKey());
        assertEquals("1", query.getValue());
    }

    @Test
    @DisplayName("Should add query using QueryArgument as argument")
    void addQuery2Test() {
        //given
        QueryParameter queryParameter = new QueryParameter("page", 1);

        //when
        AnimeBuilder urlBuilder = new AnimeBuilder(JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT);
        urlBuilder.addQuery(queryParameter);
        Set<QueryParameter> queries = urlBuilder.getQueries();

        QueryParameter query = queries.stream().findFirst().get();

        //then
        assertNotNull(query);
        assertEquals("page", query.getKey());
        assertEquals("1", query.getValue());
    }
}