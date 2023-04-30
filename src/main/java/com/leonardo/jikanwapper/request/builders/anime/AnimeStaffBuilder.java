package com.leonardo.jikanwapper.request.builders.anime;

import com.leonardo.jikanwapper.records.anime.staff.AnimeStaffData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;
import lombok.NonNull;

public class AnimeStaffBuilder extends UrlBuilder implements RequestBuilder<AnimeStaffData> {
    public AnimeStaffBuilder(@NonNull String url) {
        super(url);
    }
    @Override
    public Request<AnimeStaffData> build() {
        return new Request(getUrl(), AnimeStaffData.class);
    }
}
