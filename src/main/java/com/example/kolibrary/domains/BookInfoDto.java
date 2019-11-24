package com.example.kolibrary.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BookInfoDto {
    private Long bookInfoID;
    private String bookInfoTitle;
    private String bookInfoAuthor;
    private int bookInfoYearPublication;
}
