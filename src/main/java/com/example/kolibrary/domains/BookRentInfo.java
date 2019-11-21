package com.example.kolibrary.domains;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity(name = "BOOKSRENT")
public class BookRentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BOOK_RENT_ID", unique = true)
    private Long id;

    @Getter
    @Setter
    @Column(name = "1")
    private String bookRent;

    @Getter
    @Setter
    @Column(name = "2")
    private String bookRentStatus;

}
