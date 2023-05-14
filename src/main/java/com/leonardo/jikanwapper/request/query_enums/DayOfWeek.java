package com.leonardo.jikanwapper.request.query_enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DayOfWeek {

    MONDAY("filter=monday"),
    TUESDAY("filter=tuesday"),
    WEDNESDAY("filter=wednesday"),
    THURSDAY("filter=thursday"),
    FRIDAY("filter=friday"),
    SATURDAY("filter=saturday"),
    SUNDAY("filter=sunday"),
    UNKNOWN("filter=unknown");

    private final String query;
}
