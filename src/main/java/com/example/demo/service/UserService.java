package com.example.demo.service;

import com.example.demo.dto.UserDto;

import java.util.List;

/**
 * Created by ShehanAb on 5/7/18.
 */
public interface UserService {
    UserDto getUserById(Integer userId);

    void saveUser(UserDto userDto);

    List<UserDto> getAllUsers();
}
