package com.leonardo.jikanwapper.request;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.genres.GenreData;
import com.leonardo.jikanwapper.records.maganize.MagazineData;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestTest {

    @Test
    @DisplayName("Should return the request url")
    void toStringTest() {

        //given
        Request<GenreData> request = JikanBuilder
                .genre()
                .anime()
                .build();

        String expected = JikanConstants.HOST + "/genres/anime";

        //when
        String actual = request.toString();

        //then
        assertEquals(actual, expected);
    }


//    @Test
//    @DisplayName("Should return an GenreData object")
//    void requestGenreTest() {
//
//        //given
//        Request<GenreData> request = JikanBuilder
//                .genre()
//                .anime()
//                .build();
//
//        //when
//        GenreData actual = request.request();
//
//        //then
//        assertNotNull(actual);
//    }
//
//
//    @Test
//    @DisplayName("Should return an MagazineData object")
//    void requestMagazineTest() {
//
//        //given
//        Request<MagazineData> request = JikanBuilder
//                .magazine()
//                .query("jump")
//                .build();
//
//        //when
//        MagazineData actual = request.request();
//
//        //then
//        assertNotNull(actual);
//    }

}