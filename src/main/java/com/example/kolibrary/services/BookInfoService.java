package com.example.kolibrary.services;

import com.example.kolibrary.domains.BookInfo;
import com.example.kolibrary.exceptions.BookInfoNotFoundException;
import com.example.kolibrary.repositories.BookInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookInfoService {

    @Autowired
    private BookInfoRepository bookInfoRepository;

    public BookInfo createBookInfo (final BookInfo bookInfo){
        return bookInfoRepository.save(bookInfo);
    }

    public BookInfo getBookInfoByID(final Long bookInfoID) throws BookInfoNotFoundException{
        return bookInfoRepository.findById(bookInfoID).orElseThrow(BookInfoNotFoundException::new);
    }

    public List<BookInfo> getBookInfoAll(){
        return bookInfoRepository.findAll();
    }

    public BookInfo updateBookInfo (final BookInfo bookInfo) throws BookInfoNotFoundException {
        BookInfo bookInfoUpdated = bookInfoRepository.findById(bookInfo.getBookInfoID()).orElseThrow(BookInfoNotFoundException::new);
        bookInfoUpdated.setBookInfoAuthor(bookInfo.getBookInfoAuthor());
        bookInfoUpdated.setBookInfoTitle(bookInfo.getBookInfoTitle());
        bookInfoUpdated.setBookInfoYearPublication(bookInfo.getBookInfoYearPublication());

        return bookInfoRepository.save(bookInfoUpdated);
    }

    public void deleteBookInfo(final Long bookInfoID) throws  BookInfoNotFoundException{
        BookInfo bookInfo1 = bookInfoRepository.findById(bookInfoID).orElseThrow(BookInfoNotFoundException::new);

        bookInfoRepository.delete(bookInfo1);
    }



}
