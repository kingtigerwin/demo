package com.tiger.demo.repositories;

import com.tiger.demo.DemoApplication;
import com.tiger.demo.entities.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@ExtendWith(SpringExtension.class)
//@SpringBootTest(classes = DemoApplication.class)
//@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class PersonRepositoryTest {

//    @Autowired
//    private PersonRepository personRepository;

//    @Test
//    public void shouldInsertIntoDBGivenCorrectlyPersonObject() {
//        Person person = Person.builder().name("tiger").build();
//        Person personInDB = personRepository.save(person);
//        Assertions.assertEquals("tiger", personInDB.getName());
//        Assertions.assertNotNull(personInDB.getId());
//    }
//
//    @Test
//    @Transactional
//    public void shouldUpdatePersonNameGivenPersonName() {
//        Person person = Person.builder().name("tiger").password("password").build();
//        Person personFromDB = personRepository.save(person);
//        int i = personRepository.updatePersonName("cathy");
//        List<Person> name = personRepository.findAll();
//        Assertions.assertEquals("cathy", name.get(0).getName());
//    }
//
//    @Test
//    @Transactional
//    public void shouldDeletePersonGivenPersonName() {
//
//    }

}
