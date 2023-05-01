package com.leonardo.jikanwapper.records.aired;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.leonardo.jikanwapper.JikanConstants;

import java.time.LocalDateTime;

public record Aired(
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = JikanConstants.DEFAULT_DATE_PATTERN, timezone = JikanConstants.DEFAULT_TIMEZONE)
        LocalDateTime from,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = JikanConstants.DEFAULT_DATE_PATTERN, timezone = JikanConstants.DEFAULT_TIMEZONE)
        LocalDateTime to,

        AiredProp prop,
        String string

) {
}
