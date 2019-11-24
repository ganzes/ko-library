package com.example.kolibrary.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class BookRentInfoDto {
    private Long bookRentID;
    private Reader reader;
    private LocalDate bookRentWithdrawnDate;
    private LocalDate bookRentReturnDate;

}
