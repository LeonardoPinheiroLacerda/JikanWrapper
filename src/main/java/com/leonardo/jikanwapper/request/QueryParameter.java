package com.leonardo.jikanwapper.request;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "key")

public class QueryParameter {

    private final String key;
    private final String value;


    public QueryParameter(String expression) {
        String[] args = expression.split("=");
        this.key = args[0];
        this.value = args[1];
    }

    public QueryParameter(String key, Object value) {
        this.key = key;
        this.value = value.toString();
    }

    public String toString() {
        return this.key + "=" + this.value;
    }

}
