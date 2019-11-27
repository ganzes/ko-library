package com.example.kolibrary.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookTitlesDto {
    private Long bookTitleID;
    private String bookTitle;
    private String bookAuthor;
    private int bookYearPublication;
    private List<BookQuantity> bookQuantityList;
}