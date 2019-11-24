package com.example.kolibrary.mappers;

import com.example.kolibrary.domains.BookRentInfo;
import com.example.kolibrary.domains.BookRentInfoDto;
import org.springframework.stereotype.Component;

@Component
public class BookRentInfoMapper {

    public BookRentInfo mapToBookRentInfo (BookRentInfoDto bookRentInfoDto){
        return new BookRentInfo(
        );
    }

    public BookRentInfoDto mapToBookRentInfoDto (BookRentInfo bookRentInfo){
        return new BookRentInfoDto(
                bookRentInfo.getBookRentID(),
                bookRentInfo.getReader(),
                bookRentInfo.getBookRentWithdrawnDate(),
                bookRentInfo.getBookRentReturnDate()
        );
    }
}
