package com.thecontainerd.apirag.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "mob_skill_pre")
@Getter
@Setter
public class MobSkillPre {

    @Id
    private Integer MOB_ID;
    private String INFO;
    private String STATE;
    private Integer SKILL_ID;
    private Integer SKILL_LV;
    private Integer RATE;
    private Long CASTTIME;
    private Integer DELAY;
    private String CANCELABLE;
    private String TARGET;
    private String CONDITION;
    private String CONDITION_VALUE;
    private Integer VAL1;
    private Integer VAL2;
    private Integer VAL3;
    private Integer VAL4;
    private Integer VAL5;
    private String EMOTION;
    private String CHAT;
}
