package com.example.desafiovtracker.util;

import java.io.BufferedReader;

public class JsonUtil {

    public static void printJson(BufferedReader bufferedReader) throws Exception {
        String result = "";
        StringBuilder jsonAPI = new StringBuilder();

        while ((result = bufferedReader.readLine()) != null) {
            jsonAPI.append(result);
        }

        System.out.println(jsonAPI.toString());
    }
}
