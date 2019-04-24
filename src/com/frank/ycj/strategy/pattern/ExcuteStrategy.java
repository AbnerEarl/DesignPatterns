package com.frank.ycj.strategy.pattern;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/4/7
 * @time: 15:17
 * @fuction: about the role of class.
 */
public class ExcuteStrategy {
    public static void main(String[] args) {
        StrategyContext strategyContext;
        strategyContext=new StrategyContext(new StrategyImp1());
        strategyContext.operate();

        strategyContext=new StrategyContext(new StrategyImp2());
        strategyContext.operate();

        strategyContext=new StrategyContext(new StrategyImp3());
        strategyContext.operate();
    }
}
