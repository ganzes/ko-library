package com.example.kolibrary.controllers;


import com.example.kolibrary.domains.ReaderDto;
import com.example.kolibrary.mappers.ReaderMapper;
import com.example.kolibrary.services.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/readers")
public class ReaderController {

    @Autowired
    private ReaderService readerService;

    @Autowired
    private ReaderMapper readerMapper;

    @PostMapping(value = "/createreader", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createReader(@RequestBody ReaderDto readerDto){
        readerService.createReader(readerMapper.mapToReader(readerDto));
    }
}
