package com.frank.ycj.factorymethod.pattern;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/4/7
 * @time: 16:15
 * @fuction: about the role of class.
 */
public class YellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄种人会笑。");
    }

    @Override
    public void color() {
        System.out.println("皮肤是黄色。");
    }
}
