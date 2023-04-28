package com.leonardo.jikanwapper.request.builders;

import com.leonardo.jikanwapper.request.builders.genre.GenreBuilder;
import com.leonardo.jikanwapper.request.builders.magazine.MagazineBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JikanBuilderTest {

    @Test
    @DisplayName("Should return a GenreBuilder")
    void genre() {
        //when
        GenreBuilder builder = JikanBuilder.genre();

        //then
        assertNotNull(builder);
    }

    @Test
    @DisplayName("Should return a MagazineBuilder")
    void magazine() {
        //when
        MagazineBuilder builder = JikanBuilder.magazine();

        //then
        assertNotNull(builder);
    }
}