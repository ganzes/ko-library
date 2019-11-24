package com.example.kolibrary.repositories;

import com.example.kolibrary.domains.BookQtyInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface BookQtyInfoRepository extends CrudRepository <BookQtyInfo, Long> {
}
