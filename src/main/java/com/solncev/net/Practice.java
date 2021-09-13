package com.solncev.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Practice {
    public static void main(String[] args) {
        HttpClientImpl httpClient = new HttpClientImpl();
        try {
            URL url = new URL("http://jsonplaceholder.typicode.com/posts?userId=1");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();


            connection.setRequestProperty("Content-Type", "application/json");

            connection.setRequestMethod("GET");

            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            System.out.println(connection.getResponseCode());

            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream())
            )) {
                StringBuilder content = new StringBuilder();
                String input;
                while ((input = reader.readLine()) != null) {
                    content.append(input);
                }
                System.out.println(content.toString());
            }
            connection.disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            URL testUrl = new URL("");
            URLConnection connection2= testUrl.openConnection();
            connection2.setRequestProperty("Cont", "ohef");
            System.out.println(connection2.getContent());

            //httpClient.get("https://postman-echo.com/get", )
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
