package com.example.kolibrary.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class BookRentDto {
    private Long bookRentID;
    private Reader readerID;
    private BookQuantity bookQuantityID;
    private LocalDate bookRentWithdrawnDate;
    private LocalDate bookRentReturnDate;

}
