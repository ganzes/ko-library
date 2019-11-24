package com.example.kolibrary.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class ReaderDto {
    private Long readerID;
    private String readerName;
    private String readerLastName;
    private LocalDate readerAccountDateCreated;
}
