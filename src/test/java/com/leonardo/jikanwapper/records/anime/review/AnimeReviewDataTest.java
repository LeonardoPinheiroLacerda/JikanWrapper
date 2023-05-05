package com.leonardo.jikanwapper.records.anime.review;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.records.anime.staff.AnimeStaffData;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeReviewDataTest {

    @Test
    @DisplayName("Serialization test for AnimeReviewData")
    void serializationTest() {

        //when
        AnimeReviewData actual = JikanBuilder.anime().id(1).reviews().build().request();

        //then
        assertNotNull(actual);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}