package com.example.demo.service.impl;

import com.example.demo.dto.SkillDto;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.assertj.core.internal.Arrays;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by ShehanAb on 7/24/2018.
 */
public class UserServiceimplTest {

    @Autowired
    private UserService userService;

    @Before
    public void setUp() throws Exception{
        String[]x ={"Ludo", "Chesstitans", "Palle", "Monkey"};
    }

    @Test
    public void getUserById() throws Exception {
        SkillDto js = new SkillDto(3, "JS");
        SkillDto java = new SkillDto(4, "JAVA");

        ArrayList skills = new ArrayList();
        skills.add(js);
        skills.add(java);

        UserDto user = new UserDto(2, "Shehan", skills, "Ab");

        System.out.println(userService);
        System.out.println(user);

        userService.saveUser(user);

        UserDto savedUser = userService.getUserById(2);

        Assert.assertNotNull(savedUser);
        Assert.assertEquals(savedUser.getUserName(), savedUser.getUserName());
    }

    @Test
    public void saveUser() throws Exception {
        SkillDto js = new SkillDto(1, "JS");
        SkillDto java = new SkillDto(2, "JAVA");

        ArrayList skills = new ArrayList();
        skills.add(js);
        skills.add(java);

        UserDto user = new UserDto(1, "Shehan", skills, "Ab");

        userService.saveUser(user);

        UserDto savedUser = userService.getUserById(1);

        Assert.assertNotNull(savedUser);
        Assert.assertEquals(savedUser.getUserName(), savedUser.getUserName());
    }

    @Test
    public void getAllUsers() throws Exception {



    }

}