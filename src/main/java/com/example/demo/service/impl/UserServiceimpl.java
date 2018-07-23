package com.example.demo.service.impl;

import com.example.demo.converter.UserTransformer;
import com.example.demo.dto.UserDto;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ShehanAb on 5/7/18.
 */
@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private
    UserRepository userRepository;

    @Override
    public UserDto getUserById(Integer userId) {
        return UserTransformer.entityToDto(userRepository.getOne(userId));
    }

    @Override
    public void saveUser(UserDto userDto) {
        userRepository.save(UserTransformer.dtoToEntity(userDto));
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream().map(UserTransformer::entityToDto).collect(Collectors.toList());
    }

}
