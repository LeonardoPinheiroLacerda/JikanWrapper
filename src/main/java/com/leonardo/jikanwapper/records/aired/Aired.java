package com.leonardo.jikanwapper.records.aired;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record Aired(
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'+00:00'", timezone = "UTC")
        LocalDateTime from,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'+00:00'", timezone = "UTC")
        LocalDateTime to,

        AiredProp prop,
        String string

) {
}
