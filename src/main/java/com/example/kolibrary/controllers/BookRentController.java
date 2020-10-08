package com.example.kolibrary.controllers;

import com.example.kolibrary.domains.BookRent;
import com.example.kolibrary.domains.BookRentDto;
import com.example.kolibrary.exceptions.BookRentNotFoundException;
import com.example.kolibrary.mappers.BookRentMapper;
import com.example.kolibrary.services.BookRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@CrossOrigin("*")
@RestController
@RequestMapping("v1/rents")
public class BookRentController {

    @Autowired
    private BookRentService bookRentService;

    @Autowired
    private BookRentMapper bookRentMapper;

    @PostMapping(value = "/createBookRent", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createBookRent(@RequestBody BookRentDto bookRentDto){
        bookRentService.createBookRent(bookRentMapper.mapToBookRent(bookRentDto));
    }

    @PutMapping(value = "/bookRentWithdrawn")
    public BookRentDto bookRentWithdrawn(@RequestParam BookRentDto bookRentDto) throws BookRentNotFoundException {
        BookRent bookRentWithdrawn = bookRentService.rentWithdrawDate(bookRentMapper.mapToBookRent(bookRentDto));
        bookRentWithdrawn.setBookRentWithdrawnDate(LocalDate.now());

        return bookRentMapper.mapToBookRentDto(bookRentWithdrawn);
    }

    @PutMapping(value = "/bookRentReturn")
    public BookRentDto bookRentReturn(@RequestParam BookRentDto bookRentDto) throws BookRentNotFoundException {
        BookRent bookRentReturn = bookRentService.rentWithdrawDate(bookRentMapper.mapToBookRent(bookRentDto));
        bookRentReturn.setBookRentReturnDate(LocalDate.now());

        return bookRentMapper.mapToBookRentDto(bookRentReturn);
    }

}
