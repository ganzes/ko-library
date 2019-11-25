package com.example.kolibrary.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "READERS")
public class Reader {

    public Reader(String readerName, String readerLastName, LocalDate readerAccountDateCreated) {
        this.readerName = readerName;
        this.readerLastName = readerLastName;
        this.readerAccountDateCreated = LocalDate.now();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "READER_ID", unique = true)
    private Long readerID;

    @Getter
    @Setter
    @Column(name = "READER_NAME")
    private String readerName;

    @Getter
    @Setter
    @Column(name = "READER_LASTNAME")
    private String readerLastName;

    @Getter
    @Setter
    @Column(name = "READER_ACCOUNT_DATE_CREATED")
    private LocalDate readerAccountDateCreated;

}
