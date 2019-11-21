package com.example.kolibrary.repositories;

import com.example.kolibrary.domains.BookRentInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface BookRentInfoRepository extends CrudRepository <BookRentInfo, Long> {
}
