package com.tiger.demo.services;

import com.tiger.demo.dtos.person.PersonGetDto;
import com.tiger.demo.dtos.person.PersonPostDto;
import com.tiger.demo.dtos.person.PersonPutDto;
import com.tiger.demo.entities.Person;
import com.tiger.demo.mappers.PersonMapper;
import com.tiger.demo.repositories.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PersonService {

//    private final PersonRepository personRepository;
//
//    private final PersonMapper personMapper;
//
//    public PersonGetDto createPerson(PersonPostDto personPostDto) {
//        Person person = personMapper.toEntity(personPostDto);
//        PersonGetDto personGetDto = personMapper.fromEntity(personRepository.save(person));
//        return personGetDto;
//    }
//
//    public PersonGetDto modifyPerson(UUID personId, PersonPutDto personPutDto) {
//        Person person = new Person();
//        personMapper.copy(personPutDto, person);
//        person.setId(personId);
//        return personMapper.fromEntity(personRepository.save(person));
//    }
//
//    public void deletePerson(UUID id) {
//        personRepository.deleteById(id);
//    }
//
//    public PersonGetDto findPersonById(UUID id) {
//        PersonGetDto personGetDto = personMapper.fromEntity(personRepository.getOne(id));
//        return personGetDto;
//    }
//
//    public PersonGetDto findPersonByName(String name) {
//        PersonGetDto personGetDto = personMapper.fromEntity(personRepository.findByName(name));
//        return personGetDto;
//    }
//
//    public List<Person> getAllPersons() {
//        return personRepository.findAll();
//    }
}
