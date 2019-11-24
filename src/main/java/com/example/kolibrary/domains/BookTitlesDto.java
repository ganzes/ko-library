package com.example.kolibrary.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BookTitlesDto {
    private Long bookTitleID;
    private String bookTitle;
    private String bookAuthor;
    private int bookYearPublication;
}
