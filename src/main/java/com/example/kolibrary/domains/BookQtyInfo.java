package com.example.kolibrary.domains;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity(name = "BOOK_QUANTITY")
public class BookQtyInfo {

    public BookQtyInfo(String bookQtyStatus) {
        this.bookQtyStatus = bookQtyStatus;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BOOK_QUANTITY_ID", unique = true)
    private Long bookQtyID;




    @Getter
    @Setter
    @Column(name = "BOOK_QUANTITY_STATUS")
    private String bookQtyStatus;

}
