package com.tiger.demo.mappers;

import com.tiger.demo.dtos.person.PersonGetDto;
import com.tiger.demo.dtos.person.PersonPostDto;
import com.tiger.demo.dtos.person.PersonPutDto;
import com.tiger.demo.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PersonMapper {

    Person toEntity(PersonPostDto personPostDto);

    PersonGetDto fromEntity(Person person);

    void copy(PersonPutDto personPutDto,@MappingTarget Person person);
}
