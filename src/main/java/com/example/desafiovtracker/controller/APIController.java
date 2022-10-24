package com.example.desafiovtracker.controller;

import com.example.desafiovtracker.service.APIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class APIController {

    @Autowired
    private APIService apiService;

    @GetMapping("/search")
    public void search(@RequestParam("subject") String subject) throws Exception {
        apiService.searchResults(subject);
    }
}
