package com.leonardo.jikanwapper.request.builders.schedule;

import com.leonardo.jikanwapper.records.schedule.ScheduleData;
import com.leonardo.jikanwapper.request.Request;
import com.leonardo.jikanwapper.request.RequestBuilder;
import com.leonardo.jikanwapper.request.UrlBuilder;
import com.leonardo.jikanwapper.request.query_enums.DayOfWeek;

public class ScheduleBuilder extends UrlBuilder implements RequestBuilder<ScheduleData> {
    public ScheduleBuilder(String url) {
        super(url);
    }

    @Override
    public Request<ScheduleData> build() {
        return new Request(getUrl(), ScheduleData.class);
    }

    public ScheduleBuilder page(Integer page) {
        addQuery("page", page);
        return this;
    }

    public ScheduleBuilder limit(Integer limit) {
        addQuery("limit", limit);
        return this;
    }

    public ScheduleBuilder filter(DayOfWeek filter) {
        addQuery(filter.getQuery());
        return this;
    }



}
