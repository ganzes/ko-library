package com.example.kolibrary.controllers;

import com.example.kolibrary.domains.BookTitlesDto;
import com.example.kolibrary.mappers.BookTitlesMapper;
import com.example.kolibrary.services.BookTitlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/titles")
public class BookTitlesController {

    @Autowired
    private BookTitlesService bookTitlesService;

    @Autowired
    private BookTitlesMapper bookTitlesMapper;

    @PostMapping(value = "/createBookTitle", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createBookTitle(@RequestBody BookTitlesDto bookTitlesDto){
        bookTitlesService.createBookTitle(bookTitlesMapper.mapToBookTitles(bookTitlesDto));
    }

}
