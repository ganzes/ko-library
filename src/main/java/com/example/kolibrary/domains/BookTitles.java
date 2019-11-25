package com.example.kolibrary.domains;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "BOOK_TITLES")
public class BookTitles {

    public BookTitles(String bookTitle, String bookAuthor, int bookYearPublication) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYearPublication = bookYearPublication;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BOOK_TITLE_ID", unique = true)
    private Long bookTitleID;

    @Getter
    @Setter
    @Column(name = "BOOK_TITLE")
    private String bookTitle;

    @Getter
    @Setter
    @Column(name = "BOOK_AUTHOR")
    private String bookAuthor;

    @Getter
    @Setter
    @Column(name = "BOOK_YEAR_PUBLICATION")
    private int bookYearPublication;

}
