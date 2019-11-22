package com.example.kolibrary.domains;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity(name = "BOOK_INFO")
public class BookInfo {

    public BookInfo(String title, String status) {
        this.title = title;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BOOK_ID", unique = true)
    private Long id;

    @Getter
    @Setter
    @Column(name = "BOOK_TITLE")
    private String title;

    @Getter
    @Setter
    @Column(name = "BOOK_STATUS")
    private String status;
}
