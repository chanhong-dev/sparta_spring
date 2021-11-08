package com.sparta.week01.service;

import com.sparta.week01.domain.Person;
import com.sparta.week01.domain.PersonRepository;
import com.sparta.week01.dto.PersonRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PersonService {
    private final PersonRepository personRepository;

    public Person savePerson(Person person){
        return personRepository.save(person);
    }

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public void deleteById(String name){
        personRepository.deleteByName(name);
    }

//    public void updatePerson(String name, PersonRequestDto personRequestDto){
//        return personRepository.update(name, personRequestDto);
//    }
}
