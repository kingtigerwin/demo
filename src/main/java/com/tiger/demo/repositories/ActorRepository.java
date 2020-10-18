package com.tiger.demo.repositories;

import com.tiger.demo.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Long> {

    List<Actor> findByFirstnameOrLastname(String firstname, String lastname);


}
