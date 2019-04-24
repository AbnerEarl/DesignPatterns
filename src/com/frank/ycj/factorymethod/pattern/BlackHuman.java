package com.frank.ycj.factorymethod.pattern;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/4/7
 * @time: 16:17
 * @fuction: about the role of class.
 */
public class BlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑种人会笑。");
    }

    @Override
    public void color() {
        System.out.println("皮肤是黑色。");

    }
}
