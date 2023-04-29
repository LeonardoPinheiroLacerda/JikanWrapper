package com.leonardo.jikanwapper.util;

import com.leonardo.jikanwapper.request.QueryParameter;

import java.util.Set;

public class QueryParameterBuilder {

    public static String build(Set<QueryParameter> queries) {
        StringBuilder queriesStr = new StringBuilder("?");
        for(QueryParameter query : queries) {

            if(queriesStr.length() > 1) {
                queriesStr.append("&");
            }
            queriesStr.append(query);

        }
        return queriesStr.toString().equals("?") ? "" : queriesStr.toString();
    }
}
