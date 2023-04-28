package com.leonardo.jikanwapper.request.genre;

import com.leonardo.jikanwapper.JikanConstants;

public class GenreBuilder {

    private String url = JikanConstants.HOST + "/genres";

    public GenreQueryBuilder anime() {
        return new GenreQueryBuilder(url + "/anime");
    }

    public GenreQueryBuilder manga() {
        return new GenreQueryBuilder(url + "/manga");
    }


}
