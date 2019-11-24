package com.example.kolibrary.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class BookRentInfoDto {
    private Long id;
    private LocalDate dateOfBookWithdrawn;
    private LocalDate dateOfBookReturn;
}
