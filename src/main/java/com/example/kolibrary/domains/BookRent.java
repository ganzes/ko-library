package com.example.kolibrary.domains;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Entity(name = "BOOK_RENTS")
public class BookRent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BOOK_RENT_ID", unique = true)
    private Long bookRentID;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "READER_ID")
    private Reader readerID;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "BOOK_QUANTITY_ID")
    private BookQuantity bookQuantityID;

    @Getter
    @Setter
    @Column(name = "BOOK_RENT_WITHDRAWN_DATE")
    private LocalDate bookRentWithdrawnDate;

    @Getter
    @Setter
    @Column(name = "BOOK_RENT_RETURN_DATE")
    private LocalDate bookRentReturnDate;
}
