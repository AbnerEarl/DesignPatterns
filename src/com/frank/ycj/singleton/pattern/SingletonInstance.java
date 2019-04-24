package com.frank.ycj.singleton.pattern;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/4/7
 * @time: 15:39
 * @fuction: about the role of class.
 */
public class SingletonInstance {
    private static SingletonInstance singletonInstance=null;
    private SingletonInstance(){

    }

    public synchronized static SingletonInstance getInstance(){
        if (singletonInstance==null){
            singletonInstance=new SingletonInstance();
        }
        return singletonInstance;
    }

    public static void function(){
        System.out.println("单例具有的功能");
    }
}
