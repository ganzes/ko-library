package com.example.kolibrary.services;

import com.example.kolibrary.domains.BookTitles;
import com.example.kolibrary.exceptions.BookTitlesNotFoundException;
import com.example.kolibrary.repositories.BookTitlesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookTitlesService {

    @Autowired
    private BookTitlesRepository bookTitlesRepository;

    public BookTitles createBookTitle (final BookTitles bookTitles){
        return bookTitlesRepository.save(bookTitles);
    }

    public BookTitles getBookInfoByID(final Long bookInfoID) throws BookTitlesNotFoundException {
        return bookTitlesRepository.findById(bookInfoID).orElseThrow(BookTitlesNotFoundException::new);
    }

    public List<BookTitles> getBookInfoAll(){
        return bookTitlesRepository.findAll();
    }

    public BookTitles updateBookInfo (final BookTitles bookTitles) throws BookTitlesNotFoundException {
        BookTitles bookTitlesUpdated = bookTitlesRepository.findById(bookTitles.getBookTitleID()).orElseThrow(BookTitlesNotFoundException::new);
        bookTitlesUpdated.setBookTitle(bookTitles.getBookTitle());
        bookTitlesUpdated.setBookAuthor(bookTitles.getBookAuthor());
        bookTitlesUpdated.setBookYearPublication(bookTitles.getBookYearPublication());

        return bookTitlesRepository.save(bookTitlesUpdated);
    }

    public void deleteBookInfo(final Long bookInfoID) throws BookTitlesNotFoundException {
        BookTitles bookTitles1 = bookTitlesRepository.findById(bookInfoID).orElseThrow(BookTitlesNotFoundException::new);

        bookTitlesRepository.delete(bookTitles1);
    }



}
