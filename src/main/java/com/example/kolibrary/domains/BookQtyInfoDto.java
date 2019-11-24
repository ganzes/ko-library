package com.example.kolibrary.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BookQtyInfoDto {
    private Long bookQtyID;
    private String bookQtyStatus;
}
