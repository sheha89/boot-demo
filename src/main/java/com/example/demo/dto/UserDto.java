package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ShehanAb on 5/7/18.
 */
public class UserDto implements Serializable{
    private Integer userId;
    private String userName;
    private String lastName;
    private List<SkillDto> skillDtos = new ArrayList<>();

    public UserDto(Integer userId, String userName, List<SkillDto> skillDtos, String lastName) {
        this.userId = userId;
        this.userName = userName;
        this.skillDtos = skillDtos;
        this.lastName = lastName;
    }

    public UserDto() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<SkillDto> getSkillDtos() {
        return skillDtos;
    }

    public void setSkillDtos(List<SkillDto> skillDtos) {
        this.skillDtos = skillDtos;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", skillDtos=" + skillDtos +
                '}';
    }
}
