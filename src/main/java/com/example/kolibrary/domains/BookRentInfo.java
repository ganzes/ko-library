package com.example.kolibrary.domains;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Entity(name = "BOOK_RENT_INFO")
public class BookRentInfo {

    public BookRentInfo(LocalDate dateOfBookWithdrawn, LocalDate dateOfBookReturn) {
        this.dateOfBookWithdrawn = dateOfBookWithdrawn;
        this.dateOfBookReturn = dateOfBookReturn;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BOOK_RENT_ID", unique = true)
    private Long id;

    @Getter
    @Setter
    @Column(name = "BOOK_DATE_WITHDRAWN")
    private LocalDate dateOfBookWithdrawn;

    @Getter
    @Setter
    @Column(name = "BOOK_DATE_RETURN")
    private LocalDate dateOfBookReturn;
}
