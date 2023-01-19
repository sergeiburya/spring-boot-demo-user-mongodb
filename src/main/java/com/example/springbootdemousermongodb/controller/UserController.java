package com.example.springbootdemousermongodb.controller;

import com.example.springbootdemousermongodb.dto.UserMapper;
import com.example.springbootdemousermongodb.dto.UserRequestDto;
import com.example.springbootdemousermongodb.dto.UserResponseDto;
import com.example.springbootdemousermongodb.service.UserService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final UserMapper mapper;

    public UserController(UserService userService, UserMapper mapper) {
        this.userService = userService;
        this.mapper = mapper;
    }

    @PostMapping("/add-user")
    public UserResponseDto create(@RequestBody UserRequestDto requestDto) {
        return mapper.toDto(userService.create(mapper.toModel(requestDto)));
    }

    @GetMapping
    public List<UserResponseDto> findAll() {
        return userService.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }
}
