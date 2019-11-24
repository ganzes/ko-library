package com.example.kolibrary.mappers;

import com.example.kolibrary.domains.BookRent;
import com.example.kolibrary.domains.BookRentDto;
import org.springframework.stereotype.Component;

@Component
public class BookRentMapper {

    public BookRent mapToBookRent (BookRentDto bookRentDto){
        return new BookRent(
        );
    }

    public BookRentDto mapToBookRentDto (BookRent bookRent){
        return new BookRentDto(
                bookRent.getBookRentID(),
                bookRent.getReaderID(),
                bookRent.getBookQuantityID(),
                bookRent.getBookRentWithdrawnDate(),
                bookRent.getBookRentReturnDate()
        );
    }
}
