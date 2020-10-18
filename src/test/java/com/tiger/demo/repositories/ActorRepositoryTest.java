package com.tiger.demo.repositories;

import com.tiger.demo.DemoApplication;
import com.tiger.demo.entities.Actor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = DemoApplication.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class ActorRepositoryTest {

    @Autowired
    ActorRepository actorRepository;

    @Test
    public void shouldReturnActorsGivenFirstnameOrLastname() {
        List<Actor> actors = actorRepository.findByFirstnameOrLastname("Tom", "Dano");
        Assertions.assertNotNull(actors);
    }


}
