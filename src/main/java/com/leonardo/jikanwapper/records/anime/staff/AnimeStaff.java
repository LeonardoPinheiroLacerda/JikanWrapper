package com.leonardo.jikanwapper.records.anime.staff;

import com.leonardo.jikanwapper.records.anime.AnimePerson;

import java.util.List;

public record AnimeStaff(
        AnimePerson person,
        List<String> positions
) {
}
