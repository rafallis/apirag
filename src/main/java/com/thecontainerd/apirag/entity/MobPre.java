package com.thecontainerd.apirag.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "mob_pre")
@Getter
@Setter
public class MobPre {

    @Id
    private Long ID;
    private String Sprite;
    private String kName;
    private String iName;
    private Integer LV;
    private Long HP;
    private Long SP;
    private Long EXP;
    private Long JEXP;
    private Integer Range1;
    private Integer ATK1;
    private Integer ATK2;
    private Integer DEF;
    private Integer MDEF;
    private Integer STR;
    private Integer AGI;
    private Integer VIT;
    private Integer INT;
    private Integer DEX;
    private Integer LUK;
    private Integer Range2;
    private Integer Range3;
    private Integer Scale;
    private Integer Race;
    private Integer Element;
    private Long Mode;
    private Integer Speed;
    private Integer aDelay;
    private Integer aMotion;
    private Integer dMotion;
    private Long MEXP;
    private Integer MVP1id;
    private Integer MVP1per;
    private Integer MVP2id;
    private Integer MVP2per;
    private Integer MVP3id;
    private Integer MVP3per;
    private Integer Drop1id;
    private Integer Drop1per;
    private Integer Drop2id;
    private Integer Drop2per;
    private Integer Drop3id;
    private Integer Drop3per;
    private Integer Drop4id;
    private Integer Drop4per;
    private Integer Drop5id;
    private Integer Drop5per;
    private Integer Drop6id;
    private Integer Drop6per;
    private Integer Drop7id;
    private Integer Drop7per;
    private Integer Drop8id;
    private Integer Drop8per;
    private Integer Drop9id;
    private Integer Drop9per;
    private Integer DropCardid;
    private Integer DropCardper;
}
