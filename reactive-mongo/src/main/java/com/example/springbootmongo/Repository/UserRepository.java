package com.example.springbootmongo.Repository;

import com.example.springbootmongo.Document.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends MongoRepository<User, Integer> {
}