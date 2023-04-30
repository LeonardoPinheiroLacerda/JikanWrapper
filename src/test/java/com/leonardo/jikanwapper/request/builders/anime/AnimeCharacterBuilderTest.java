package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.anime.character.AnimeCharacterData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AnimeCharacterBuilderTest {

    @Test
    @DisplayName("Should build a request for animesCharacters")
    void buildTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1/characters";

        //when
        Request<AnimeCharacterData> actual = JikanBuilder.anime().id(1).character().build();

        //then
        assertNotNull(actual);
        assertEquals(expected, actual.toString());

    }

}