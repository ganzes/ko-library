package com.example.kolibrary.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BookInfoDto {

    private Long id;
    private String title;
    private String status;
}
