package com.example.kolibrary.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BookInfoTitlesDto {
    private Long bookInfoTitleID;
    private String bookInfoTitle;
    private String bookInfoAuthor;
    private int bookInfoYearPublication;
}
