package com.backend.angular.controller;

import com.backend.angular.modal.Person;
import com.backend.angular.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;




    @RequestMapping("/test")
    public  String test()
    {
        return  "I am working!";
    }




    @RequestMapping("/create")
    public String create(@RequestParam String firstName , @RequestParam String lastName, @RequestParam int age)
    {
        Person p = personService.create(firstName,lastName,age);
        return p.toString();
    }

    @RequestMapping("/get")
    public  List<Person> getPerson(@RequestParam String firstName)
    {

        return personService.getByFirstName(firstName);
    }

    @RequestMapping("/api/getAll")
    public List<Person> getAll()
    {
        return  personService.getAll();
    }

    @RequestMapping("/update")
    public List<Person> update(@RequestParam String firstName,String lastName,int age)
    {
        return  personService.update(firstName,lastName,age);
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam String firstName)
    {
        personService.deleteByFirstName(firstName);
        return "Deleted " + firstName;
    }
    @RequestMapping("/deleteAll")
    public String deleteAll()
    {
        personService.deleteAll();
        return "All Documents Deleted";
    }

    @RequestMapping("/getAboveAge")
    public List<Person> getAboveAge(@RequestParam int age)
    {
        System.out.println(age);
      return personService.getPersonsAboveAge(age);
    }
    @RequestMapping("/searchPerson")
    public List<Person> searchPerson(@RequestParam String firstName)
    {

        return personService.getPersonsByFirstNameRegex(firstName);
    }
}
