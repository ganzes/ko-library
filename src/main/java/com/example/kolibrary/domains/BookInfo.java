package com.example.kolibrary.domains;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity(name = "BOOK_INFO")
public class BookInfo {

    public BookInfo(String bookInfoTitle, String bookInfoAuthor, int bookInfoYearPublication) {
        this.bookInfoTitle = bookInfoTitle;
        this.bookInfoAuthor = bookInfoAuthor;
        this.bookInfoYearPublication = bookInfoYearPublication;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BOOK_INFO_ID", unique = true)
    private Long bookInfoID;

    @Getter
    @Setter
    @Column(name = "BOOK_INFO_TITLE")
    private String bookInfoTitle;

    @Getter
    @Setter
    @Column(name = "BOOK_INFO_AUTHOR")
    private String bookInfoAuthor;

    @Getter
    @Setter
    @Column(name = "BOOK_INFO_YEAR_PUBLICATION")
    private int bookInfoYearPublication;
}
