package com.example.desafiovtracker.service.impl;

import com.example.desafiovtracker.service.APIService;
import com.example.desafiovtracker.service.ConnectionAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class NewsAPIServiceImpl implements APIService {

    @Autowired
    private Environment env;

    @Autowired
    private ConnectionAPIService connectionAPIService;

    @Override
    public void searchResults(String subject) throws Exception {
        String url = env.getProperty("api.url") + "/v2/everything?q=" + subject + "&apiKey=" + env.getProperty("api.key");

        connectionAPIService.connectAPI(url);
    }
}
