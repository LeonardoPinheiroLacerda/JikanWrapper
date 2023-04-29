package com.leonardo.jikanwapper.request;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.leonardo.jikanwapper.exceptions.JikanRequestException;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRequest {

    public static <T> T get(String url, Class<T> clazz) {

        Integer statusCode = 0;
        String statusMessage = "";
        InputStream responseStream = null;

        try{
            URL Url = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) Url.openConnection();
            connection.setRequestMethod("GET");

            responseStream = connection.getInputStream();

            statusCode = connection.getResponseCode();
            statusMessage = connection.getResponseMessage();

            if(statusCode != 200) {
                throw new IOException();
            }

        }catch(IOException e) {
            throw new JikanRequestException("Invalid Url, probably you made some mistake while building it. Request response data = {URL: '" + url + "', Response: '" + statusCode + " " + statusMessage + "'}");
        }

        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());

            return mapper.readValue(responseStream, clazz);
        } catch(IOException e) {
            throw new JikanRequestException("Couldn't serialize object", e);
        }

    }

}
