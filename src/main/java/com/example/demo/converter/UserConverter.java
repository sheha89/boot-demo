package com.example.demo.converter;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;

import java.util.stream.Collectors;

/**
 * Created by ShehanAb on 5/7/18.
 */
public class UserConverter {
    public static User dtoToEntity(UserDto userDto) {
        User user = new User(userDto.getUserName(), null);
        user.setUserId(userDto.getUserId());
        user.setSkills(userDto.getSkillDtos().stream().map(SkillConverter::dtoToEntity).collect(Collectors.toList()));
        user.setLastName(userDto.getLastName());
        return user;
    }

    public static UserDto entityToDto(User user) {
        UserDto userDto = new UserDto(user.getUserId(), user.getUserName(), null, user.getLastName());
        userDto.setSkillDtos(user.getSkills().stream().map(SkillConverter::entityToDto).collect(Collectors.toList()));
        return userDto;
    }
}
