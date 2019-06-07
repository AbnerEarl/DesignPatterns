package com.frank.ycj.abstractfactory.pattern;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/6/7
 * @time: 13:48
 * @fuction: about the role of class.
 */
public enum HumanEnum {
    YelloMaleHuman("com.frank.ycj.abstractfactory.pattern.YellowMaleHuman"),
    YelloFemaleHuman("com.frank.ycj.abstractfactory.pattern.YellowFemaleHuman"),
    WhiteFemaleHuman("com.frank.ycj.abstractfactory.pattern.WhiteFemaleHuman"),
    WhiteMaleHuman("com.frank.ycj.abstractfactory.pattern.WhiteMaleHuman"),
    BlackFemaleHuman("com.frank.ycj.abstractfactory.pattern.BlackFemaleHuman"),
    BlackMaleHuman("com.frank.ycj.abstractfactory.pattern.BlackMaleHuman");
    private String value = "";
    //定义构造函数，目的是Data(value)类型的相匹配
    private HumanEnum(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
}
