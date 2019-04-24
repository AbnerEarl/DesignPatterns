package com.frank.ycj.proxy.pattern;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/4/7
 * @time: 15:26
 * @fuction: about the role of class.
 */
public class DetailMan2 implements KindMan {
    @Override
    public void work() {
        System.out.println("被代理的人2开始工作了。");
    }

    @Override
    public void sing() {
        System.out.println("被代理的人2开始唱歌了。");

    }
}
