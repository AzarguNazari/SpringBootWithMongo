package com.example.secondExample.repository;

import com.example.secondExample.model.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;



public interface PersonRepository extends ReactiveMongoRepository<Person, String>{
    Flux<Person> findByFirstName(String name);

    Flux<Person> findOneByFirstName(String name);
//
//    @Query("{ 'firstName': ?0, 'age': ?1}")
//    Mono<Person> findByFirstNameAndAge(String firstname, int age);
//
//    // Accept parameter inside a reactive type for deferred execution
//    Flux<Person> findByAge(Mono<Integer> age);
//
//    /**
//     * Derived query selecting by {@code lastname}.
//     *
//     * @param lastname
//     * @return
//     */
//    Flux<Person> findByLastname(String lastname);
//
//    /**
//     * String query selecting one entity.
//     *
//     * @param lastname
//     * @return
//     */
//    @Query("{ 'firstName': ?0, 'lastName': ?1}")
//    Mono<Person> findByFirstnameAndLastname(String firstname, String lastname);
//
//    /**
//     * Derived query selecting by {@code lastname}. {@code lastname} uses deferred resolution that does not require
//     * blocking to obtain the parameter value.
//     *
//     * @param lastname
//     * @return
//     */
//    Flux<Person> findByLastname(Mono<String> lastname);
//
//    /**
//     * Derived query selecting by {@code firstname} and {@code lastname}. {@code firstname} uses deferred resolution that
//     * does not require blocking to obtain the parameter value.
//     *
//     * @param firstname
//     * @param lastname
//     * @return
//     */
//    Mono<Person> findByFirstnameAndLastname(Mono<String> firstname, String lastname);

}
