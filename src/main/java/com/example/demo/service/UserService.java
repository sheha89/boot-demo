package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserDto;

/**
 * Created by ShehanAb on 5/7/18.
 */
public interface UserService {
    UserDto getUserById(Integer userId);
    void saveUser(UserDto userDto);
    List<UserDto> getAllUsers();
}
