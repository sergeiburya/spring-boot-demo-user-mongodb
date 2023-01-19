package com.example.springbootdemousermongodb.dto;

import com.example.springbootdemousermongodb.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserResponseDto toDto(User user) {
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setId(user.getId());
        userResponseDto.setName(user.getName());
        userResponseDto.setEmail(user.getEmail());
        return userResponseDto;
    }

    public User toModel(UserRequestDto requestDto) {
        User user = new User();
        user.setName(requestDto.getName());
        user.setEmail(requestDto.getEmail());
        return user;
    }
}
