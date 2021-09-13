package com.solncev.net;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class HttpClientImpl implements HttpClient{
    @Override
    public String get(String url, Map<String, String> headers, Map<String, String> params) {
        try {
            URL url1=new URL(url);
            HttpURLConnection connection=(HttpURLConnection) url1.openConnection();
            connection.setRequestProperty("content-type","application/json");
            connection.setRequestMethod("GET");
            System.out.println(connection.getResponseCode());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String post(String url, Map<String, String> headers, Map<String, String> params) {
        return null;
    }
}
