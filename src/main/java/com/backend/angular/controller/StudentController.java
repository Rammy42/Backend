package com.backend.angular.controller;

import com.backend.angular.modal.Student;
import com.backend.angular.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

     @Autowired
    private StudentService ss;

     @RequestMapping("/saveStudent")
     public String saveStudent(@RequestParam String name, @RequestParam String dpt,  @RequestParam int roll)
     {
         return ss.saveStudent(name,dpt,roll);
     }

     @RequestMapping("/getAllStudents")
    public List<Student> getAllStudents()
     {
         return ss.getAllStudents();
     }




}
