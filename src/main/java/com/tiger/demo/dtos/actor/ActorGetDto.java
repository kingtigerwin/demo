package com.tiger.demo.dtos.actor;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class ActorGetDto {

    private Long id;

    private String firstname;

    private String lastname;

    private String gender;

    private LocalDate dateOfBirth;
}
