package com.tiger.demo.repositories;

import com.tiger.demo.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

//public interface PersonRepository extends JpaRepository<Person, UUID> {
public class PersonRepository {
//    Person findByName(String name);

//    @Query("select p from Person p where p.name= :name")
//    List<Person> findByPersonName(@Param("name") String name);
//
//    @Query("select p from Person p where p.name = :personName or p.id = :personId")
//    Person findByPersonNameOrPersonId(@Param("personName") String personName,
//                                      @Param("personId") String personId);
//
//    @Query(value = "SELECT * FROM PERSON WHERE NAME = :personName", nativeQuery = true)
//    Person findByEmailAddress(@Param("personName") String personName);
//
//    @Modifying(flushAutomatically = true)
//    @Query("update Person p set p.name = :name")
//    int updatePersonName(@Param("name") String name);

//    @Modifying
//    @Query("delete from Person p where p.role.id = :roleId")
//    void deleteInBulkByRoleId(@Param("roleId") long roleId);
}
