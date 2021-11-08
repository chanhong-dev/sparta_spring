package com.sparta.week01.Controller;

import com.sparta.week01.domain.Person;
import com.sparta.week01.domain.PersonRepository;
import com.sparta.week01.dto.CourseRequestDto;
import com.sparta.week01.dto.PersonRequestDto;
import com.sparta.week01.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PersonController {
    private final PersonService personService;

    @PostMapping("/api/persons")
    public Person savePerson(@RequestBody PersonRequestDto personRequestDto){
        Person person = new Person(personRequestDto);

        return personService.savePerson(person);
    }

    @GetMapping("/api/persons")
    public List<Person> getPersons(){
        return personService.findAll();
    }

    @DeleteMapping("/api/persons/{name}")
    public String deletePerson(@PathVariable String name){
        personService.deleteById(name);

        return name;
    }

//    @PutMapping("/api/persons/{name}")
//    public String updatePerson(@PathVariable String name, @RequestBody PersonRequestDto personRequestDto){
//        personService.updatePerson(name, personRequestDto);
//
//        return name;
//    }
}
