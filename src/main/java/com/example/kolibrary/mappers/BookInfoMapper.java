package com.example.kolibrary.mappers;

import com.example.kolibrary.domains.BookInfoTitles;
import com.example.kolibrary.domains.BookInfoTitlesDto;
import org.springframework.stereotype.Component;

@Component
public class BookInfoMapper {

    public BookInfoTitles mapToBookInfo(BookInfoTitlesDto bookInfoTitlesDto){
        return new BookInfoTitles(
                bookInfoTitlesDto.getBookInfoTitle(),
                bookInfoTitlesDto.getBookInfoAuthor(),
                bookInfoTitlesDto.getBookInfoYearPublication()
        );
    }

    public BookInfoTitlesDto mapToBookInfoDto(BookInfoTitles bookInfoTitles){
        return new BookInfoTitlesDto(
                bookInfoTitles.getBookInfoTitleID(),
                bookInfoTitles.getBookInfoTitle(),
                bookInfoTitles.getBookInfoAuthor(),
                bookInfoTitles.getBookInfoYearPublication()
        );
    }
}
