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

    @Transactional
    public Long update(Long id, PersonRequestDto requestDto){
        Person person = personRepository.findById(id).orElseThrow(
                ()-> new NullPointerException("해당 아이디가 존재하지 않습니다.")
        );
        person.update(requestDto);
        return person.getId();
    }
}
