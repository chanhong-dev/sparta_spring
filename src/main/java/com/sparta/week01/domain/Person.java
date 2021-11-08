package com.sparta.week01.domain;

import com.sparta.week01.dto.PersonRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;


    public Person(PersonRequestDto personRequestDto) {
        this.id = personRequestDto.getId();
        this.name = personRequestDto.getName();
        this.age = personRequestDto.getAge();
    }
}
