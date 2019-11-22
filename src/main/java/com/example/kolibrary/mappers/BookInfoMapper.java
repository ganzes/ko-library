package com.example.kolibrary.mappers;

import com.example.kolibrary.domains.BookInfo;
import com.example.kolibrary.domains.BookInfoDto;
import org.springframework.stereotype.Component;

@Component
public class BookInfoMapper {

    public BookInfo mapToBookInfo(BookInfoDto bookInfoDto){
        return new BookInfo(
                bookInfoDto.getTitle(),
                bookInfoDto.getStatus());
    }

    public BookInfoDto mapToBookInfoDto(BookInfo bookInfo){
        return new BookInfoDto(
                bookInfo.getId(),
                bookInfo.getTitle(),
                bookInfo.getStatus());
    }
}
