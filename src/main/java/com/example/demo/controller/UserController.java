package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import com.example.demo.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ShehanAb on 5/7/18.
 */
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(Constants.GET_USER_BY_ID)
    public UserDto getUserById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }

    @RequestMapping(Constants.GET_ALL_USERS)
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = Constants.SAVE_USER, method = RequestMethod.POST)
    public void saveUser(@RequestBody UserDto userDto) {
        //Fixme : use a log
        System.out.println(userDto);
        userService.saveUser(userDto);
    }
}
