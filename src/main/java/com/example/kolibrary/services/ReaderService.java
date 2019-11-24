package com.example.kolibrary.services;

import com.example.kolibrary.domains.Reader;
import com.example.kolibrary.exceptions.ReaderNotFoundException;
import com.example.kolibrary.repositories.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderService {
    @Autowired
    private ReaderRepository readerRepository;

    public Reader createReader(final Reader reader){
        return readerRepository.save(reader);
    }

    public Reader getReaderById(final Long readerId) throws ReaderNotFoundException{
        return readerRepository.findById(readerId).orElseThrow(ReaderNotFoundException::new);
    }

    public List<Reader> getReaderAll(){
        return readerRepository.findAll();
    }

    public Reader updateReader(final Reader reader) throws ReaderNotFoundException{
        Reader updatedReader = readerRepository.findById(reader.getId()).orElseThrow(ReaderNotFoundException::new);
        updatedReader.setName(reader.getName());
        updatedReader.setName(reader.getLastName());

        return readerRepository.save(updatedReader);
    }

    public void deleteReaderById(final Long readerId) throws ReaderNotFoundException {
        Reader deleteReader = readerRepository.findById(readerId).orElseThrow(ReaderNotFoundException::new);

        readerRepository.delete(deleteReader);
    }
}
