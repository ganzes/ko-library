package com.example.kolibrary.domains;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity(name = "BOOK_TITLES")
public class BookInfoTitles {

    public BookInfoTitles(String bookInfoTitle, String bookInfoAuthor, int bookInfoYearPublication) {
        this.bookInfoTitle = bookInfoTitle;
        this.bookInfoAuthor = bookInfoAuthor;
        this.bookInfoYearPublication = bookInfoYearPublication;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BOOK_TITLE_ID", unique = true)
    private Long bookInfoTitleID;

    @Getter
    @Setter
    @Column(name = "BOOK_TITLE")
    private String bookInfoTitle;

    @Getter
    @Setter
    @Column(name = "BOOK_AUTHOR")
    private String bookInfoAuthor;

    @Getter
    @Setter
    @Column(name = "BOOK_YEAR_PUBLICATION")
    private int bookInfoYearPublication;

}
