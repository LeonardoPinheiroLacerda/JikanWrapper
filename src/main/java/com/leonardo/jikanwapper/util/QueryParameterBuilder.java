package com.leonardo.jikanwapper.util;

import java.util.List;

public class QueryParameterBuilder {

    public static String build(List<String> queries) {
        StringBuilder queriesStr = new StringBuilder("?");
        for(String query : queries) {

            if(queriesStr.length() > 1) {
                queriesStr.append("&");
            }
            queriesStr.append(query);

        }
        return queriesStr.toString();
    }
}
