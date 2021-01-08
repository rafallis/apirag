package com.thecontainerd.apirag.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mob_re")
public class MobRe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sprite;
    private String kName;
    private String iName;
    private String bName;
    private Integer LV;
    private Integer HP;
    private Integer SP;
    private Integer EXP;
    private Integer JEXP;
    private Integer range1;
    private Integer atk1;
    private Integer atk2;
    private Integer def;
    private Integer mdef;
    private Integer str;
    private Integer agi;
    private Integer vit;
    @Column(name = "INT")
    private Integer intel;
    private Integer dex;
    private Integer luk;
    private Integer range2;
    private Integer range3;
    private Integer scale;
    private Integer race;
    private Integer element;
    private Integer mode;
    private Integer speed;
    private Integer aDelay;
    private Integer aMotion;
    private Integer dMotion;
    private Integer mExp;
    private Integer mvp1id;
    private Integer mvp1per;
    private Integer mvp2id;
    private Integer mvp2per;
    private Integer mvp3id;
    private Integer mvp3per;
    private Integer drop1id;
    private Integer drop1per;
    private Integer drop2id;
    private Integer drop2per;
    private Integer drop3id;
    private Integer drop3per;
    private Integer drop4id;
    private Integer drop4per;
    private Integer drop5id;
    private Integer drop5per;
    private Integer drop6id;
    private Integer drop6per;
    private Integer drop7id;
    private Integer drop7per;
    private Integer drop8id;
    private Integer drop8per;
    private Integer drop9id;
    private Integer drop9per;
    private Integer dropCardId;
    private Integer dropCardPer;

    public MobRe() {}

    public MobRe(Long id, String sprite, String kName, String iName, String bName, Integer LV, Integer HP, Integer SP, Integer EXP, Integer JEXP, Integer range1, Integer atk1, Integer atk2, Integer def, Integer mdef, Integer str, Integer agi, Integer vit, Integer intel, Integer dex, Integer luk, Integer range2, Integer range3, Integer scale, Integer race, Integer element, Integer mode, Integer speed, Integer aDelay, Integer aMotion, Integer dMotion, Integer mExp, Integer mvp1id, Integer mvp1per, Integer mvp2id, Integer mvp2per, Integer mvp3id, Integer mvp3per, Integer drop1id, Integer drop1per, Integer drop2id, Integer drop2per, Integer drop3id, Integer drop3per, Integer drop4id, Integer drop4per, Integer drop5id, Integer drop5per, Integer drop6id, Integer drop6per, Integer drop7id, Integer drop7per, Integer drop8id, Integer drop8per, Integer drop9id, Integer drop9per, Integer dropCardId, Integer dropCardPer) {
        this.id = id;
        this.sprite = sprite;
        this.kName = kName;
        this.iName = iName;
        this.bName = bName;
        this.LV = LV;
        this.HP = HP;
        this.SP = SP;
        this.EXP = EXP;
        this.JEXP = JEXP;
        this.range1 = range1;
        this.atk1 = atk1;
        this.atk2 = atk2;
        this.def = def;
        this.mdef = mdef;
        this.str = str;
        this.agi = agi;
        this.vit = vit;
        this.intel = intel;
        this.dex = dex;
        this.luk = luk;
        this.range2 = range2;
        this.range3 = range3;
        this.scale = scale;
        this.race = race;
        this.element = element;
        this.mode = mode;
        this.speed = speed;
        this.aDelay = aDelay;
        this.aMotion = aMotion;
        this.dMotion = dMotion;
        this.mExp = mExp;
        this.mvp1id = mvp1id;
        this.mvp1per = mvp1per;
        this.mvp2id = mvp2id;
        this.mvp2per = mvp2per;
        this.mvp3id = mvp3id;
        this.mvp3per = mvp3per;
        this.drop1id = drop1id;
        this.drop1per = drop1per;
        this.drop2id = drop2id;
        this.drop2per = drop2per;
        this.drop3id = drop3id;
        this.drop3per = drop3per;
        this.drop4id = drop4id;
        this.drop4per = drop4per;
        this.drop5id = drop5id;
        this.drop5per = drop5per;
        this.drop6id = drop6id;
        this.drop6per = drop6per;
        this.drop7id = drop7id;
        this.drop7per = drop7per;
        this.drop8id = drop8id;
        this.drop8per = drop8per;
        this.drop9id = drop9id;
        this.drop9per = drop9per;
        this.dropCardId = dropCardId;
        this.dropCardPer = dropCardPer;
    }

    public Long getId() {
        return id;
    }

    public String getSprite() {
        return sprite;
    }

    public String getkName() {
        return kName;
    }

    public String getiName() {
        return iName;
    }

    public String getbName() { return bName; }

    public Integer getLV() {
        return LV;
    }

    public Integer getHP() {
        return HP;
    }

    public Integer getSP() {
        return SP;
    }

    public Integer getEXP() {
        return EXP;
    }

    public Integer getJEXP() {
        return JEXP;
    }

    public Integer getRange1() {
        return range1;
    }

    public Integer getAtk1() {
        return atk1;
    }

    public Integer getAtk2() {
        return atk2;
    }

    public Integer getDef() {
        return def;
    }

    public Integer getMdef() {
        return mdef;
    }

    public Integer getStr() {
        return str;
    }

    public Integer getAgi() {
        return agi;
    }

    public Integer getVit() {
        return vit;
    }

    public Integer getIntel() {
        return intel;
    }

    public Integer getDex() {
        return dex;
    }

    public Integer getLuk() {
        return luk;
    }

    public Integer getRange2() {
        return range2;
    }

    public Integer getRange3() {
        return range3;
    }

    public Integer getScale() {
        return scale;
    }

    public Integer getRace() {
        return race;
    }

    public Integer getElement() {
        return element;
    }

    public Integer getMode() {
        return mode;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getaDelay() {
        return aDelay;
    }

    public Integer getaMotion() {
        return aMotion;
    }

    public Integer getdMotion() {
        return dMotion;
    }

    public Integer getmExp() {
        return mExp;
    }

    public Integer getMvp1id() {
        return mvp1id;
    }

    public Integer getMvp1per() {
        return mvp1per;
    }

    public Integer getMvp2id() {
        return mvp2id;
    }

    public Integer getMvp2per() {
        return mvp2per;
    }

    public Integer getMvp3id() {
        return mvp3id;
    }

    public Integer getMvp3per() {
        return mvp3per;
    }

    public Integer getDrop1id() {
        return drop1id;
    }

    public Integer getDrop1per() {
        return drop1per;
    }

    public Integer getDrop2id() {
        return drop2id;
    }

    public Integer getDrop2per() {
        return drop2per;
    }

    public Integer getDrop3id() {
        return drop3id;
    }

    public Integer getDrop3per() {
        return drop3per;
    }

    public Integer getDrop4id() {
        return drop4id;
    }

    public Integer getDrop4per() {
        return drop4per;
    }

    public Integer getDrop5id() {
        return drop5id;
    }

    public Integer getDrop5per() {
        return drop5per;
    }

    public Integer getDrop6id() {
        return drop6id;
    }

    public Integer getDrop6per() {
        return drop6per;
    }

    public Integer getDrop7id() {
        return drop7id;
    }

    public Integer getDrop7per() {
        return drop7per;
    }

    public Integer getDrop8id() {
        return drop8id;
    }

    public Integer getDrop8per() {
        return drop8per;
    }

    public Integer getDrop9id() {
        return drop9id;
    }

    public Integer getDrop9per() {
        return drop9per;
    }

    public Integer getDropCardId() {
        return dropCardId;
    }

    public Integer getDropCardPer() {
        return dropCardPer;
    }
}
