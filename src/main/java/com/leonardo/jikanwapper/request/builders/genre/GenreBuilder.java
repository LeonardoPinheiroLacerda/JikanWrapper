package com.leonardo.jikanwapper.request.builders.genre;

import com.leonardo.jikanwapper.request.UrlBuilder;

public class GenreBuilder extends UrlBuilder {

    public GenreBuilder(String url) {
        super(url);
    }

    public GenreQueryBuilder anime() {
        return new GenreQueryBuilder(getUrl() + "/anime");
    }

    public GenreQueryBuilder manga() {
        return new GenreQueryBuilder(getUrl() + "/manga");
    }


}
