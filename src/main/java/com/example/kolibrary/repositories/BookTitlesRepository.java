package com.example.kolibrary.repositories;

import com.example.kolibrary.domains.BookTitles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface BookTitlesRepository extends CrudRepository <BookTitles, Long>{

    @Override
    List<BookTitles> findAll();
}
