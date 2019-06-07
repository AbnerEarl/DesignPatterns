package com.frank.ycj.abstractfactory.pattern;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/6/7
 * @time: 13:38
 * @fuction: about the role of class.
 */
public abstract class AbstractBlackHuman implements Human {
    public void cry() {
        System.out.println("黑色人类会哭");
    }
    public void laugh() {
        System.out.println("黑色人类会大笑，幸福呀！ ");
    }
    public void talk() {
        System.out.println("黑色人类会说话，一般说的都是双字节");
    }
}
