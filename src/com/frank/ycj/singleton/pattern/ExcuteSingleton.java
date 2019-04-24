package com.frank.ycj.singleton.pattern;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/4/7
 * @time: 15:42
 * @fuction: about the role of class.
 */
public class ExcuteSingleton {
    public static void main(String[] args) {
        SingletonInstance singletonInstance1=SingletonInstance.getInstance();
        singletonInstance1.function();

        SingletonInstance singletonInstance2=SingletonInstance.getInstance();
        singletonInstance2.function();

        SingletonInstance singletonInstance3=SingletonInstance.getInstance();
        singletonInstance3.function();
    }
}
