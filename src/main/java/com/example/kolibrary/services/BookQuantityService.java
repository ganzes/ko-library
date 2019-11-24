package com.example.kolibrary.services;

import com.example.kolibrary.domains.BookQuantity;
import com.example.kolibrary.exceptions.BookQuantityNotFoundException;
import com.example.kolibrary.repositories.BookQuantityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookQuantityService {

    @Autowired
    private BookQuantityRepository bookQuantityRepository;

    public BookQuantity createQuantity(final BookQuantity bookQuantity) {
        return bookQuantityRepository.save(bookQuantity);
    }

    public BookQuantity getQuantityByID(final Long bookQuantityID) throws BookQuantityNotFoundException {
        return bookQuantityRepository.findById(bookQuantityID).orElseThrow(BookQuantityNotFoundException::new);
    }

    public List<BookQuantity> getQuantityAll(){
        return bookQuantityRepository.findAll();
    }

    public BookQuantity updateQuantityStatus(final BookQuantity bookQuantity) throws BookQuantityNotFoundException {
        BookQuantity bookQuantityUpdate = bookQuantityRepository.findById(bookQuantity.getBookQtyID()).orElseThrow(BookQuantityNotFoundException::new);
        bookQuantityUpdate.setBookQtyStatus(bookQuantity.getBookQtyStatus());

        return bookQuantityRepository.save(bookQuantityUpdate);
    }

    public BookQuantity updateQuantityStatusLost(final Long bookQuantityID) throws BookQuantityNotFoundException {
        BookQuantity bookQuantityUpdate = bookQuantityRepository.findById(bookQuantityID).orElseThrow(BookQuantityNotFoundException::new);
        bookQuantityUpdate.setBookQtyStatus("Lost");

        return bookQuantityRepository.save(bookQuantityUpdate);
    }

    public void deleteQuantityByID(final Long bookQuantityID) throws BookQuantityNotFoundException {
        BookQuantity deleteQuantity = bookQuantityRepository.findById(bookQuantityID).orElseThrow(BookQuantityNotFoundException::new);

        bookQuantityRepository.delete(deleteQuantity);
    }
}