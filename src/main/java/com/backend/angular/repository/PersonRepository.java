package com.backend.angular.repository;

import com.backend.angular.modal.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
    public List<Person> findByFirstName(String firstName);
    public List<Person> findAll();
    public List<Person> findByAge(int age);

    @Query("{'age' : {$gt : ?0}}")
    public List<Person> findByAgeGreaterThan(int age);


    @Query("{'firstName' : {$regex : ?0}}")
    public List<Person> getFirstNameRegex(String firstName);

}
