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

    public BookInfo getBookInfoById(final Long bookInfoId) throws BookInfoNotFoundException{
        return bookInfoRepository.findById(bookInfoId).orElseThrow(BookInfoNotFoundException::new);
    }

    public List<BookInfo> getBookInfoAll(){
        return bookInfoRepository.findAll();
    }

    public BookInfo updateBookInfo (final BookInfo bookInfo) throws BookInfoNotFoundException {
        BookInfo bookInfoUpdated = bookInfoRepository.findById(bookInfo.getId()).orElseThrow(BookInfoNotFoundException::new);
        bookInfoUpdated.setStatus(bookInfo.getStatus());
        bookInfoUpdated.setTitle(bookInfo.getTitle());

        return bookInfoRepository.save(bookInfoUpdated);
    }

    public BookInfo updateBookInfoStatus (final BookInfo bookInfo) throws BookInfoNotFoundException {
        BookInfo bookInfoUpdatedStatus = bookInfoRepository.findById(bookInfo.getId()).orElseThrow(BookInfoNotFoundException::new);
        bookInfoUpdatedStatus.setStatus(bookInfo.getStatus());

        return bookInfoRepository.save(bookInfoUpdatedStatus);
    }

    public void deleteBookInfo(final Long bookInfo) throws  BookInfoNotFoundException{
        BookInfo bookInfo1 = bookInfoRepository.findById(bookInfo).orElseThrow(BookInfoNotFoundException::new);

        bookInfoRepository.delete(bookInfo1);
    }



}
