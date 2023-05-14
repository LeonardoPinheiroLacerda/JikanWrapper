package com.leonardo.jikanwapper.request.builders.schedule;

import com.leonardo.jikanwapper.records.schedule.ScheduleData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;

public class ScheduleBuilder extends UrlBuilder implements RequestBuilder<ScheduleData> {
    public ScheduleBuilder(String url) {
        super(url);
    }

    @Override
    public Request<ScheduleData> build() {
        return new Request(getUrl(), ScheduleData.class);
    }
}
