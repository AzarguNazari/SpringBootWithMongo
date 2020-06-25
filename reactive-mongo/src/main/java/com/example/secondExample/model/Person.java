package com.example.secondExample.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
//@Entity
public class Person {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
    }

    public Person(String id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
