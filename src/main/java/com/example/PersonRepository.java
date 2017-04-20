package com.example;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface PersonRepository extends PagingAndSortingRepository<person, Long> {

    List<person> findByLastName(@Param("lastname") String lastname);

}