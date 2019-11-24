package com.example.kolibrary.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BookQuantityDto {
    private Long bookQtyID;
    private String bookQtyStatus;
}
