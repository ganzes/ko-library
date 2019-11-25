package com.example.kolibrary.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BookQuantityDto {
    private Long bookQtyID;
    private BookTitles bookTitleID;
    private String bookQtyStatus;
}
