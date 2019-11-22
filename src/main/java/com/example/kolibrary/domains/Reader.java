package com.example.kolibrary.domains;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Entity(name = "READERS")
public class Reader {

    public Reader(String name, String lastName, LocalDate accountDateCreated) {
        this.name = name;
        this.lastName = lastName;
        this.accountDateCreated = accountDateCreated;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "READER_ID", unique = true)
    private Long id;

    @Getter
    @Setter
    @Column(name = "READER_NAME")
    private String name;

    @Getter
    @Setter
    @Column(name = "READER_LASTNAME")
    private String lastName;

    @Getter
    @Setter
    @Column(name = "READER_ACCOUNT_DATE_CREATED")
    private LocalDate accountDateCreated;

}
