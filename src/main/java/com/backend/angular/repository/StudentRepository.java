package com.backend.angular.repository;

import com.backend.angular.modal.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository  extends MongoRepository<Student,String> {
    //save
    //delete
    public List<Student> findAll();
    public Student findByDpt(String dpt);
}
