package com.example.desafiovtracker.service;

public interface ConnectionAPIService {

    public void connectAPI(String searchUrl) throws Exception;

    public void connectAPI(String searchUrl, String token) throws Exception;
}
