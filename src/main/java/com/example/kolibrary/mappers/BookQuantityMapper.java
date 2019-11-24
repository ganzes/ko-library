package com.example.kolibrary.mappers;

import com.example.kolibrary.domains.BookQuantity;
import com.example.kolibrary.domains.BookQuantityDto;
import org.springframework.stereotype.Component;

@Component
public class BookQuantityMapper {

    public BookQuantity mapToBookQuantity(BookQuantityDto bookQuantityDto) {
        return new BookQuantity(
        );
    }
    public BookQuantityDto mapToBookQuantityDto(BookQuantity bookQuantity){
        return new BookQuantityDto(
                bookQuantity.getBookQtyID(),
                bookQuantity.getBookQtyStatus()
        );
    }
}
