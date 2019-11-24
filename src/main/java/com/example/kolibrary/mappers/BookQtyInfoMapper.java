package com.example.kolibrary.mappers;

import com.example.kolibrary.domains.BookQtyInfo;
import com.example.kolibrary.domains.BookQtyInfoDto;
import org.springframework.stereotype.Component;

@Component
public class BookQtyInfoMapper {

    public BookQtyInfo mapToBookQtyInfo(BookQtyInfoDto bookQtyInfoDto) {
        return new BookQtyInfo(
          bookQtyInfoDto.getBookQtyStatus()
        );
    }
    public BookQtyInfoDto mapToBookQtyInfoDto(BookQtyInfo bookQtyInfo){
        return new BookQtyInfoDto(
                bookQtyInfo.getBookQtyID(),
                bookQtyInfo.getBookQtyStatus()
        );
    }
}
