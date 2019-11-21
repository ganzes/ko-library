package com.example.kolibrary.domains;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity(name = "BOOK_RENT_INFO")
public class BookRentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BOOK_RENT_ID", unique = true)
    private Long id;
}
