package com.example.kolibrary.repositories;

import com.example.kolibrary.domains.BookInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface BookInfoRepository extends CrudRepository <BookInfo, Long>{

    @Override
    List<BookInfo> findAll();
}
