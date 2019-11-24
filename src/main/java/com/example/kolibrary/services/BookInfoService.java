package com.example.kolibrary.services;

import com.example.kolibrary.repositories.BookInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookInfoService {

    @Autowired
    private BookInfoRepository bookInfoRepository;



}
