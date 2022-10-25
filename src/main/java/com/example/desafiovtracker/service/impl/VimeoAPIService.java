package com.example.desafiovtracker.service.impl;

import com.example.desafiovtracker.service.APIService;
import com.example.desafiovtracker.service.ConnectionAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class VimeoAPIService implements APIService {

    @Autowired
    private Environment env;

    @Autowired
    private ConnectionAPIService connectionAPIService;

    @Override
    public void searchResults(String subject) throws Exception {
        String url = env.getProperty("vimeo_api.url") + "/channels?filter=" + subject;

        connectionAPIService.connectAPI(url, env.getProperty("vimeo_api.token"));
    }
}
