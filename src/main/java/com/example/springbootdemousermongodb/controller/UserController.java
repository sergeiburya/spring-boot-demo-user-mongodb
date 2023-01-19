package com.example.springbootdemousermongodb.controller;

import com.example.springbootdemousermongodb.dto.UserMapper;
import com.example.springbootdemousermongodb.dto.UserRequestDto;
import com.example.springbootdemousermongodb.dto.UserResponseDto;
import com.example.springbootdemousermongodb.model.User;
import com.example.springbootdemousermongodb.repository.UserRepository;
import com.example.springbootdemousermongodb.service.UserService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final UserMapper mapper;
    private final UserRepository userRepository;

    public UserController(UserService userService, UserMapper mapper,
                          UserRepository userRepository) {
        this.userService = userService;
        this.mapper = mapper;
        this.userRepository = userRepository;
    }

    @PostMapping("/add-user")
    public UserResponseDto create(@RequestBody UserRequestDto requestDto) {
        return mapper.toDto(userService.create(mapper.toModel(requestDto)));
    }

    @PutMapping("/{id}")
    public UserResponseDto update(@PathVariable String id,
                                  @RequestBody UserRequestDto requestDto) {
        User user = mapper.toModel(requestDto);
        user.setId(id);
        return mapper.toDto(userService.create(user));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        userRepository.deleteAllById(id);
    }

    @GetMapping
    public List<UserResponseDto> findAll() {
        return userService.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }
}
