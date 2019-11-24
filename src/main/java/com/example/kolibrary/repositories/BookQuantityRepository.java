package com.example.kolibrary.repositories;

import com.example.kolibrary.domains.BookQuantity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface BookQuantityRepository extends CrudRepository <BookQuantity, Long> {
    @Override
    List<BookQuantity> findAll();
}
