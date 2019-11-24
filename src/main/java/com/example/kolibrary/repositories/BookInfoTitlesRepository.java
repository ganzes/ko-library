package com.example.kolibrary.repositories;

import com.example.kolibrary.domains.BookInfoTitles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface BookInfoTitlesRepository extends CrudRepository <BookInfoTitles, Long>{

    @Override
    List<BookInfoTitles> findAll();
}
