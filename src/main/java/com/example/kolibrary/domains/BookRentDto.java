package com.example.kolibrary.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BookRentDto {
    private Long bookRentID;
    private Reader readerID;
    private BookQuantity bookQuantityID;
    private LocalDate bookRentWithdrawnDate;
    private LocalDate bookRentReturnDate;

}
