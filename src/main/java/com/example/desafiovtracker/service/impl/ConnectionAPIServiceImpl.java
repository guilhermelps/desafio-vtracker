package com.example.desafiovtracker.service.impl;

import com.example.desafiovtracker.service.ConnectionAPIService;
import com.example.desafiovtracker.util.JsonUtil;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

@Service
public class ConnectionAPIServiceImpl implements ConnectionAPIService {

    @Override
    public void connectAPI(String searchUrl) throws Exception {
        connectAPI(searchUrl, null);
    }

    @Override
    public void connectAPI(String searchUrl, String token) throws Exception {
        URL url = new URL(searchUrl);
        URLConnection connection = url.openConnection();

        if (token != null) {
            connection.setRequestProperty("Authorization", "Bearer " + token);
        }

        InputStream inputStream = connection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));

        JsonUtil.printJson(bufferedReader);
    }
}
