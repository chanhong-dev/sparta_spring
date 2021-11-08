package com.sparta.week01.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PersonRequestDto {
    private Long id;
    private String name;
    private int age;

    public PersonRequestDto(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
