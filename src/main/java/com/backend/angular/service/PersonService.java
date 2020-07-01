package com.backend.angular.service;

import com.backend.angular.modal.Person;
import com.backend.angular.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;

@Service
public class PersonService {
        @Autowired
        private PersonRepository personRepository;

public Person create(String firstName, String lastName, int age)
{

    /// Get By FirstName
    ///  Object
    ///don't insert
    //insert
    return personRepository.save(new Person(firstName,lastName,age));
}

public List<Person> getAll()
{
    //validation
    List<Person> test = personRepository.findAll();

    //some ops

    return test;
}
public List<Person> getByAge(int age){
    return personRepository.findByAge(age);
}

public List<Person> update(String firstName, String lastName, int age)
{
    //
    List<Person> p = personRepository.findByFirstName(firstName);



    for(Person person: p)
    {
        person.setAge(age);
      person.setLastName(lastName);
    }

    return  personRepository.saveAll(p);
}
public void deleteAll()
{
    personRepository.deleteAll();
}
public void deleteByFirstName(String firstName){
    List<Person> p = personRepository.findByFirstName(firstName);
    personRepository.deleteAll(p);
}
public List<Person> getByFirstName(String firstName){
   return personRepository.findByFirstName(firstName);
}


public List<Person> getPersonsAboveAge(int age)
{
    return personRepository.findByAgeGreaterThan(age);
}

public  List<Person> getPersonsByFirstNameRegex(String firstName)
{
    return  personRepository.getFirstNameRegex(firstName);
}
}
