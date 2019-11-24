package com.example.kolibrary.mappers;

import com.example.kolibrary.domains.BookRent;
import com.example.kolibrary.domains.BookRentDto;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookRentMapper {

    public BookRent mapToBookRent (final BookRentDto bookRentDto){
        return new BookRent(
        );
    }

    public BookRentDto mapToBookRentDto (final BookRent bookRent){
        return new BookRentDto(
                bookRent.getBookRentID(),
                bookRent.getReaderID(),
                bookRent.getBookQuantityID(),
                bookRent.getBookRentWithdrawnDate(),
                bookRent.getBookRentReturnDate()
        );
    }

    public List<BookRent> mapToBookRentList (final List<BookRentDto> bookRentDtoList){
        return bookRentDtoList.stream()
                .map(this::mapToBookRent)
                .collect(Collectors.toList());
    }

    public List<BookRentDto> mapToBookRentListDto(final List<BookRent> bookRentList){
        return bookRentList.stream()
                .map(this::mapToBookRentDto)
                .collect(Collectors.toList());
    }
}
