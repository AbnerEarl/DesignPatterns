package com.frank.ycj.abstractfactory.pattern;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/6/7
 * @time: 13:56
 * @fuction: about the role of class.
 */
public class FemaleHumanFactory extends AbstractHumanFactory {

    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }

    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }

    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloFemaleHuman);
    }

}
