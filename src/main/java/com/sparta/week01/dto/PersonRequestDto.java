package com.sparta.week01.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PersonRequestDto {
    private String name;
    private int age;
    private String address;
    private String job;
}
