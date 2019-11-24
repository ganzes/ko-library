package com.example.kolibrary.services;

import com.example.kolibrary.domains.BookInfoTitles;
import com.example.kolibrary.exceptions.BookInfoTitlesNotFoundException;
import com.example.kolibrary.repositories.BookInfoTitlesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookInfoService {

    @Autowired
    private BookInfoTitlesRepository bookInfoTitlesRepository;

    public BookInfoTitles createBookInfo (final BookInfoTitles bookInfoTitles){
        return bookInfoTitlesRepository.save(bookInfoTitles);
    }

    public BookInfoTitles getBookInfoByID(final Long bookInfoID) throws BookInfoTitlesNotFoundException {
        return bookInfoTitlesRepository.findById(bookInfoID).orElseThrow(BookInfoTitlesNotFoundException::new);
    }

    public List<BookInfoTitles> getBookInfoAll(){
        return bookInfoTitlesRepository.findAll();
    }

    public BookInfoTitles updateBookInfo (final BookInfoTitles bookInfoTitles) throws BookInfoTitlesNotFoundException {
        BookInfoTitles bookInfoTitlesUpdated = bookInfoTitlesRepository.findById(bookInfoTitles.getBookInfoTitleID()).orElseThrow(BookInfoTitlesNotFoundException::new);
        bookInfoTitlesUpdated.setBookInfoAuthor(bookInfoTitles.getBookInfoAuthor());
        bookInfoTitlesUpdated.setBookInfoTitle(bookInfoTitles.getBookInfoTitle());
        bookInfoTitlesUpdated.setBookInfoYearPublication(bookInfoTitles.getBookInfoYearPublication());

        return bookInfoTitlesRepository.save(bookInfoTitlesUpdated);
    }

    public void deleteBookInfo(final Long bookInfoID) throws BookInfoTitlesNotFoundException {
        BookInfoTitles bookInfoTitles1 = bookInfoTitlesRepository.findById(bookInfoID).orElseThrow(BookInfoTitlesNotFoundException::new);

        bookInfoTitlesRepository.delete(bookInfoTitles1);
    }



}
