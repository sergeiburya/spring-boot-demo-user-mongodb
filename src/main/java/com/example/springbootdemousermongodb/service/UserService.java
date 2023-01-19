package com.example.springbootdemousermongodb.service;

import com.example.springbootdemousermongodb.model.User;
import java.util.List;

public interface UserService {

    User create(User user);

    List<User> findAll();
}
