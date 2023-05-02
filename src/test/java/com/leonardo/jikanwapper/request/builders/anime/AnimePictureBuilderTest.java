package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.anime.pictures.AnimePictureData;
import com.leonardo.jikanwapper.records.anime.staff.AnimeStaffData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimePictureBuilderTest {

    @Test
    @DisplayName("Should build a request for animesPicture")
    void buildTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1/pictures";

        //when
        Request<AnimePictureData> actual = JikanBuilder.anime().id(1).pictures().build();

        //then
        assertNotNull(actual);
        assertEquals(expected, actual.toString());

    }

}