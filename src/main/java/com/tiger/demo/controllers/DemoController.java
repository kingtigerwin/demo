package com.tiger.demo.controllers;

import com.tiger.demo.dtos.person.PersonGetDto;
import com.tiger.demo.dtos.person.PersonPostDto;
import com.tiger.demo.dtos.person.PersonPutDto;
import com.tiger.demo.entities.Person;
import com.tiger.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/persons")
public class DemoController {

    @Autowired
    private PersonService personService;

//    @PostMapping
//    public ResponseEntity<PersonGetDto> add(@RequestBody PersonPostDto personPostDto) {
//        PersonGetDto personGetDto = personService.createPerson(personPostDto);
//        return ResponseEntity.ok(personGetDto);
//    }
//
//    @PutMapping("/{personId}")
//    public ResponseEntity<PersonGetDto> modify(@PathVariable UUID personId, @RequestBody PersonPutDto personPutDto) {
//        PersonGetDto personGetDto = personService.modifyPerson(personId, personPutDto);
//        return ResponseEntity.ok(personGetDto);
//    }
//
//    @DeleteMapping("/{personId}")
//    public ResponseEntity delete(@PathVariable UUID personId) {
//        personService.deletePerson(personId);
//        return ResponseEntity.ok().build();
//    }
//
//    @GetMapping("/{personId}")
//    public ResponseEntity<PersonGetDto> findById(@PathVariable UUID personId) {
//        return ResponseEntity.ok(personService.findPersonById(personId));
//    }
//
//    @GetMapping("search")
//    public ResponseEntity<PersonGetDto> findByName(@RequestParam String personName) {
//        return ResponseEntity.ok(personService.findPersonByName(personName));
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Person>> find() {
//        List<Person> list = personService.getAllPersons();
//        return ResponseEntity.ok(list);
//    }

}
