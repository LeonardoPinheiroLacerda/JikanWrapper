package com.leonardo.jikanwapper.request;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Request<T> {

    private final String url;

    private final Class<T> clazz;

    public T request() {
        return HttpRequest.get(this.url, this.clazz);
    }

    public String toString(){
        return this.url;
    }

}
