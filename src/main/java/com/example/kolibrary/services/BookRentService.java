package com.example.kolibrary.services;

import com.example.kolibrary.domains.BookRent;
import com.example.kolibrary.exceptions.BookRentNotFoundException;
import com.example.kolibrary.repositories.BookRentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BookRentService {
    @Autowired
    private BookRentRepository bookRentRepository;

    public BookRent createBookRent(final BookRent bookRent){
        return bookRentRepository.save(bookRent);
    }

    public BookRent getRentInfoByID(final Long bookRentInfo) throws BookRentNotFoundException {
        return bookRentRepository.findById(bookRentInfo).orElseThrow(BookRentNotFoundException::new);
    }

    public BookRent rentReturnDate(final BookRent bookRent){
        BookRent returnDate = bookRentRepository.findById(bookRent.getBookRentID()).orElseThrow(BookRentNotFoundException::new);
        returnDate.setBookRentReturnDate(LocalDate.now());
        return bookRentRepository.save(returnDate);
    }

    public BookRent rentWithdrawDate(final BookRent bookRent){
        BookRent withdrawDate = bookRentRepository.findById(bookRent.getBookRentID()).orElseThrow(BookRentNotFoundException::new);
        withdrawDate.setBookRentReturnDate(LocalDate.now());
        return bookRentRepository.save(withdrawDate);
    }
}
