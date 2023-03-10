package com.example.springbootdemousermongodb.repository;

import com.example.springbootdemousermongodb.model.User;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findAll();

    void deleteAllById(String id);
}
