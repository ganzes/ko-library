package com.example.kolibrary.repositories;

import com.example.kolibrary.domains.Reader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ReaderRepository extends CrudRepository<Reader, Long> {

}
