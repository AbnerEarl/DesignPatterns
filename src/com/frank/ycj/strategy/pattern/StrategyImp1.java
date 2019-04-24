package com.frank.ycj.strategy.pattern;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/4/7
 * @time: 15:13
 * @fuction: about the role of class.
 */
public class StrategyImp1 implements IStrategy {
    @Override
    public void operate() {
        System.out.println("执行第一个策略。");
    }
}
