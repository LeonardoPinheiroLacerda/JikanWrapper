package com.leonardo.jikanwapper.records.anime.staff;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AnimeStaffDataTest {


    @Test
    @DisplayName("Serialization test for AnimeStaffData")
    void serializationTest() {

        //when
        AnimeStaffData actual = JikanBuilder.anime().id(1).staff().build().request();

        //then
        assertNotNull(actual);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}