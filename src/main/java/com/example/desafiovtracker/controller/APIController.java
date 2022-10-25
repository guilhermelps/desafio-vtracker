package com.example.desafiovtracker.controller;

import com.example.desafiovtracker.service.APIService;
import com.example.desafiovtracker.service.impl.NewsAPIServiceImpl;
import com.example.desafiovtracker.service.impl.VimeoAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class APIController {

    @Autowired
    private NewsAPIServiceImpl newsAPIService;

    @Autowired
    private VimeoAPIService vimeoAPIService;

    @GetMapping("/news-api/search")
    public void searchWithNewsAPI(@RequestParam("subject") String subject) throws Exception {
        newsAPIService.searchResults(subject);
    }

    @GetMapping("/vimeo/search")
    public void searchWithVimeo(@RequestParam("subject") String subject) throws Exception {
        vimeoAPIService.searchResults(subject);
    }
}
