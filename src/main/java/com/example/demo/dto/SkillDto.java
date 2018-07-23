package com.example.demo.dto;

import java.io.Serializable;

/**
 * Created by ShehanAb on 5/7/18.
 */
public class SkillDto implements Serializable {
    private Integer skillId;
    private String SkillName;

    public SkillDto(Integer skillId, String skillName) {
        this.skillId = skillId;
        SkillName = skillName;
    }

    public SkillDto() {
    }

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public String getSkillName() {
        return SkillName;
    }

    public void setSkillName(String skillName) {
        SkillName = skillName;
    }

    @Override
    public String toString() {
        return "SkillDto{" +
                "skillId=" + skillId +
                ", SkillName='" + SkillName + '\'' +
                '}';
    }
}
