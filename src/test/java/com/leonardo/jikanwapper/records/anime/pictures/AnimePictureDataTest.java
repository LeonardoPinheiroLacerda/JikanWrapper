package com.leonardo.jikanwapper.records.anime.pictures;

import com.leonardo.jikanwapper.exceptions.JikanRequestException;
import com.leonardo.jikanwapper.records.anime.staff.AnimeStaffData;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimePictureDataTest {

    @Test
    @DisplayName("Serialization test for AnimePictureData")
    void serializationTest() {

        //when
        AnimePictureData actual = JikanBuilder.anime().id(1).pictures().build().request();

        //then
        assertNotNull(actual);
        assertDoesNotThrow(() -> new JikanRequestException());

    }

}