package com.project.kafkaproject.service.spec;

import com.project.kafkaproject.dto.UserDto;
import com.project.kafkaproject.entity.User;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user);

    UserDto getUserById(Long id);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);
}
