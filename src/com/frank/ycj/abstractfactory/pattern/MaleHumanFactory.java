package com.frank.ycj.abstractfactory.pattern;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/6/7
 * @time: 13:55
 * @fuction: about the role of class.
 */
public class MaleHumanFactory extends AbstractHumanFactory {
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }

    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloMaleHuman);
    }
}
