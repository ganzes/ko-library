package com.example.kolibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.kolibrary.repositories")
public class KoLibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(KoLibraryApplication.class, args);
    }

}
