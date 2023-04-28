package com.leonardo.jikanwapper.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class QueryParameterBuilderTest {

    @Test
    @DisplayName("Should build query params")
    void test(){

        //given
        Set<String> queries = new HashSet<>();
        queries.add("order_by=name");
        queries.add("sort=asc");
        queries.add("q=Jump");

        String expected = "?order_by=name&sort=asc&q=Jump";

        //when
        String actual = QueryParameterBuilder.build(queries);

        //then
        assertEquals(actual, expected);

    }


    @Test
    @DisplayName("Should return an empty string")
    void emptyTest(){

        //given
        Set<String> queries = new HashSet<>();

        String expected = "";

        //when
        String actual = QueryParameterBuilder.build(queries);

        //then
        assertEquals(actual, expected);

    }

}