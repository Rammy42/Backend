package com.backend.angular.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {

    @Id
    String Id;
    String name;
    String dpt;
    int roll;

    public Student(String name, String dpt, int roll) {
        this.name = name;
        this.dpt = dpt;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", dpt='" + dpt + '\'' +
                ", roll=" + roll +
                '}';
    }
}
