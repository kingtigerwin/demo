package com.tiger.demo.dtos.person;

import lombok.Data;

import java.util.UUID;

@Data
public class PersonPutDto {

    private UUID id;
    private String name;
    private String password;
}
