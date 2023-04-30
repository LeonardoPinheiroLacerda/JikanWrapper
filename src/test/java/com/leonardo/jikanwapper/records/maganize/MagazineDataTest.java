package com.leonardo.jikanwapper.records.maganize;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import com.leonardo.jikanwapper.request.query_enums.MagazinesQueryOrderBy;
import com.leonardo.jikanwapper.request.query_enums.SearchQuerySort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MagazineDataTest {

    @Test
    @DisplayName("Serialization test for MagazineData")
    void serializationPage1Test() {

        //when
        MagazineData actual = JikanBuilder
                .magazine()
                .page(1)
                .limit(1)
                .query("jump")
                .build()
                .request();

        //then
        assertNotNull(actual);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

    @Test
    @DisplayName("Serialization test for MagazineData")
    void serializationPage2Test() {

        //when
        MagazineData actual = JikanBuilder
                .magazine()
                .page(2)
                .limit(10)
                .orderBy(MagazinesQueryOrderBy.NAME, SearchQuerySort.ASC)
                .build()
                .request();

        //then
        assertNotNull(actual);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}