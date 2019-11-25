package com.example.kolibrary.controllers;


import com.example.kolibrary.domains.BookTitlesDto;
import com.example.kolibrary.domains.ReaderDto;
import com.example.kolibrary.exceptions.BookTitlesNotFoundException;
import com.example.kolibrary.exceptions.ReaderNotFoundException;
import com.example.kolibrary.mappers.ReaderMapper;
import com.example.kolibrary.services.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/readers")
public class ReaderController {

    @Autowired
    private ReaderService readerService;

    @Autowired
    private ReaderMapper readerMapper;

    @PostMapping(value = "/createReader", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createReader(@RequestBody ReaderDto readerDto){
        readerService.createReader(readerMapper.mapToReader(readerDto));
    }

    @GetMapping(value = "/getAllReaders")
    public List<ReaderDto> getAllReaders() throws ReaderNotFoundException {
        return readerMapper.mapToReaderDtoList(readerService.getReaderAll());
    }
}
