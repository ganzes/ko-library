package com.example.kolibrary.mappers;

import com.example.kolibrary.domains.BookTitles;
import com.example.kolibrary.domains.BookTitlesDto;
import org.springframework.stereotype.Component;

@Component
public class BookTitlesMapper {

    public BookTitles mapToBookTitles(BookTitlesDto bookTitlesDto){
        return new BookTitles(
        );
    }

    public BookTitlesDto mapToBBookTitlesDto(BookTitles bookTitles){
        return new BookTitlesDto(
                bookTitles.getBookTitleID(),
                bookTitles.getBookTitle(),
                bookTitles.getBookAuthor(),
                bookTitles.getBookYearPublication()
        );
    }
}
