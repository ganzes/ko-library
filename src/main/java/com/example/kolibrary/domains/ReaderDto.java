package com.example.kolibrary.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class ReaderDto {
    private Long id;
    private String name;
    private String lastName;
    private Date accountDateCreated;
}
