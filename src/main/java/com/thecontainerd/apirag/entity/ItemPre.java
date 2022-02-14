package com.thecontainerd.apirag.entity;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "item_pre")
@Getter
@Setter
public class ItemPre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name_english;
    private String name_japanese;
    private Integer type;
    private Integer subtype;
    private Long price_buy;
    private Long price_sell;
    private Integer weight;
    private Integer atk;
    private Integer matk;
    private Integer defence;
    private Integer range;
    private Integer slots;
    private BigInteger equip_jobs;
    private Integer equip_upper;
    private Integer equip_genders;
    private Long equip_locations;
    private Integer weapon_level;
    private Integer equip_level_min;
    private Integer equip_level_max;
    private Integer refineable;
    private Integer disable_options;
    private Integer view_sprite;
    private Integer bindonequip;
    private Integer forceserial;
    private Integer buyingstore;
    private Long delay;
    private Integer trade_flag;
    private Integer trade_group;
    private Integer nouse_flag;
    private Integer nouse_group;
    private Long stack_amount;
    private Integer stack_flag;
    private Long sprite;
    private String script;
    private String equip_script;
    private String unequip_script;

}
