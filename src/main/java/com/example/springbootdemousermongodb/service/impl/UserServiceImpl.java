package com.example.springbootdemousermongodb.service.impl;

import com.example.springbootdemousermongodb.model.User;
import com.example.springbootdemousermongodb.repository.UserRepository;
import com.example.springbootdemousermongodb.service.UserService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
