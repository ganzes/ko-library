package com.example.kolibrary.mappers;

import com.example.kolibrary.domains.Reader;
import com.example.kolibrary.domains.ReaderDto;
import org.springframework.stereotype.Component;

@Component
public class ReaderMapper {
    public Reader mapToReader (ReaderDto readerDto){
        return new Reader(
                readerDto.getReaderName(),
                readerDto.getReaderLastName(),
                readerDto.getReaderAccountDateCreated());
    }

    public ReaderDto mapToReaderDto(Reader reader){
        return new ReaderDto(
                reader.getReaderID(),
                reader.getReaderName(),
                reader.getReaderLastName(),
                reader.getReaderAccountDateCreated());
    }
}
