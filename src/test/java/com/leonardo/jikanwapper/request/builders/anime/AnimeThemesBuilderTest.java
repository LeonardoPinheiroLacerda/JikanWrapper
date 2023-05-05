package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.anime.AnimeData;
import com.leonardo.jikanwapper.records.anime.themes.AnimeThemesData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeThemesBuilderTest {

    @Test
    @DisplayName("Should build a request for animesThemes")
    void buildTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1/themes";

        //when
        Request<AnimeThemesData> actual = JikanBuilder.anime().id(1).themes().build();

        //then
        assertNotNull(actual);
        assertEquals(expected, actual.toString());

    }

}