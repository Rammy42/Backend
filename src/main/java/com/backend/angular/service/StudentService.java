package com.backend.angular.service;

import com.backend.angular.modal.Student;
import com.backend.angular.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {


    @Autowired
    private StudentRepository st;

     public List<Student> getAllStudents()
     {
         return st.findAll();
     }

     public String saveStudent(String name, String dpt, int roll)
     {
         Student results = st.save(new Student(name,dpt,roll));
         return results.toString();
     }


}
