package com.frank.ycj.abstractfactory.pattern;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/6/7
 * @time: 13:58
 * @fuction: about the role of class.
 */
public class ExcuteFactory {
    public static void main(String[] args) {

        HumanFactory maleHumanFactory = new MaleHumanFactory();
        HumanFactory femaleHumanFactory = new FemaleHumanFactory();

        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();

        maleYellowHuman.cry();
        maleYellowHuman.laugh();
        maleYellowHuman.sex();

        femaleYellowHuman.cry();
        femaleYellowHuman.laugh();
        femaleYellowHuman.sex();
    }
}
