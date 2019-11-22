package com.example.kolibrary.services;

import com.example.kolibrary.domains.Reader;
import com.example.kolibrary.repositories.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReaderService {
    @Autowired
    private ReaderRepository readerRepository;

    public Reader createReader(final Reader reader){
        return readerRepository.save(reader);
    }


}
