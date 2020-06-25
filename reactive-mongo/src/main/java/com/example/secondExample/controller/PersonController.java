package com.example.secondExample.controller;

import com.example.secondExample.model.Person;
import com.example.secondExample.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonRepository personRespository;

    @GetMapping
    public Flux<Person> index() {
        return personRespository.findAll();
    }
}
