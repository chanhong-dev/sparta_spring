package com.sparta.week01.domain;

import com.sparta.week01.dto.PersonRequestDto;
import org.springframework.data.jpa.repository.JpaRepository;


import javax.transaction.Transactional;



public interface PersonRepository extends JpaRepository<Person, Long> {
    @Transactional
    Long deleteByName(String name);


}
