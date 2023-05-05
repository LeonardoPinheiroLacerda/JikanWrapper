package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.JikanConstants;
import com.leonardo.jikanwapper.records.anime.AnimeData;
import com.leonardo.jikanwapper.records.anime.relations.AnimeRelationsData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.builders.JikanBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeRelationsBuilderTest {

    @Test
    @DisplayName("Should build a request for animesRelations")
    void buildTest() {

        //given
        String expected = JikanConstants.HOST + JikanConstants.ANIME_ENDPOINT + "/1/relations";

        //when
        Request<AnimeRelationsData> actual = JikanBuilder.anime().id(1).relations().build();

        //then
        assertNotNull(actual);
        assertEquals(expected, actual.toString());

    }

}