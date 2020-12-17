package com.thecontainerd.apirag.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "item_re")
public class ItemRe implements Serializable {

    private static final long serialVersionUID=1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name_english")
    private String nameEnglish;
    @Column(name = "name_japanese")
    private String nameJapanese;
    private Integer type;
    private Integer subtype;
    @Column(name = "price_buy")
    private Integer priceBuy;
    @Column(name = "price_sell")
    private Integer priceSell;
    private Integer weight;
    private Integer atk;
    private Integer matk;
    private Integer defence;
    private Integer range;
    private Integer slots;
    private BigInteger equip_jobs;
    private Integer equip_upper;
    private Integer equip_genders;
    private Integer equip_locations;
    @Column(name = "weapon_level")
    private Integer weaponLevel;
    @Column(name = "equip_level_min")
    private Integer equipLevelMin;
    @Column(name = "equip_level_max")
    private Integer equipLevelMax;
    private Integer refineable;
    private Integer disable_options;
    private Integer view_sprite;
    private Integer bindonequip;
    private Integer forceserial;
    private Integer buyingstore;
    private Integer delay;
    private Integer trade_flag;
    private Integer trade_group;
    private Integer nouse_flag;
    private Integer nouse_group;
    private Integer stack_amount;
    private Integer stack_flag;
    private Integer sprite;

    public ItemRe(){}

    public ItemRe(Long id, String name_english, String name_japanese, Integer type, Integer subtype, Integer price_buy, Integer price_sell, Integer weight, Integer atk, Integer matk, Integer defence, Integer range, Integer slots, BigInteger equip_jobs, Integer equip_upper, Integer equip_genders, Integer equip_locations, Integer weapon_level, Integer equip_level_min, Integer equip_level_max, Integer refineable, Integer disable_options, Integer view_sprite, Integer bindonequip, Integer forceserial, Integer buyingstore, Integer delay, Integer trade_flag, Integer trade_group, Integer nouse_flag, Integer nouse_group, Integer stack_amount, Integer stack_flag, Integer sprite) {
        this.id = id;
        this.nameEnglish = name_english;
        this.nameJapanese = name_japanese;
        this.type = type;
        this.subtype = subtype;
        this.priceBuy = price_buy;
        this.priceSell = price_sell;
        this.weight = weight;
        this.atk = atk;
        this.matk = matk;
        this.defence = defence;
        this.range = range;
        this.slots = slots;
        this.equip_jobs = equip_jobs;
        this.equip_upper = equip_upper;
        this.equip_genders = equip_genders;
        this.equip_locations = equip_locations;
        this.weaponLevel = weapon_level;
        this.equipLevelMin = equip_level_min;
        this.equipLevelMax = equip_level_max;
        this.refineable = refineable;
        this.disable_options = disable_options;
        this.view_sprite = view_sprite;
        this.bindonequip = bindonequip;
        this.forceserial = forceserial;
        this.buyingstore = buyingstore;
        this.delay = delay;
        this.trade_flag = trade_flag;
        this.trade_group = trade_group;
        this.nouse_flag = nouse_flag;
        this.nouse_group = nouse_group;
        this.stack_amount = stack_amount;
        this.stack_flag = stack_flag;
        this.sprite = sprite;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public String getName_english() {
        return nameEnglish;
    }

    public String getName_japanese() {
        return nameJapanese;
    }

    public Integer getType() {
        return type;
    }

    public Integer getSubtype() {
        return subtype;
    }

    public Integer getPrice_buy() {
        return priceBuy;
    }

    public Integer getPrice_sell() {
        return priceSell;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getAtk() {
        return atk;
    }

    public Integer getMatk() {
        return matk;
    }

    public Integer getDefence() {
        return defence;
    }

    public Integer getRange() {
        return range;
    }

    public Integer getSlots() {
        return slots;
    }

    public BigInteger getEquip_jobs() {
        return equip_jobs;
    }

    public Integer getEquip_upper() {
        return equip_upper;
    }

    public Integer getEquip_genders() {
        return equip_genders;
    }

    public Integer getEquip_locations() {
        return equip_locations;
    }

    public Integer getWeapon_level() {
        return weaponLevel;
    }

    public Integer getEquip_level_min() {
        return equipLevelMin;
    }

    public Integer getEquip_level_max() {
        return equipLevelMax;
    }

    public Integer getRefineable() {
        return refineable;
    }

    public Integer getDisable_options() {
        return disable_options;
    }

    public Integer getView_sprite() {
        return view_sprite;
    }

    public Integer getBindonequip() {
        return bindonequip;
    }

    public Integer getForceserial() {
        return forceserial;
    }

    public Integer getBuyingstore() {
        return buyingstore;
    }

    public Integer getDelay() {
        return delay;
    }

    public Integer getTrade_flag() {
        return trade_flag;
    }

    public Integer getTrade_group() {
        return trade_group;
    }

    public Integer getNouse_flag() {
        return nouse_flag;
    }

    public Integer getNouse_group() {
        return nouse_group;
    }

    public Integer getStack_amount() {
        return stack_amount;
    }

    public Integer getStack_flag() {
        return stack_flag;
    }

    public Integer getSprite() {
        return sprite;
    }
}
