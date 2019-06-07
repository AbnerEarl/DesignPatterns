package com.frank.ycj.abstractfactory.pattern;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/6/7
 * @time: 13:51
 * @fuction: about the role of class.
 */
public interface HumanFactory {
    //制造黄色人类
    public Human createYellowHuman();
    //制造一个白色人类
    public Human createWhiteHuman();
    //制造一个黑色人类
    public Human createBlackHuman();
}
