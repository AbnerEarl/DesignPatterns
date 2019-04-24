package com.frank.ycj.multition.pattern;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/4/7
 * @time: 16:04
 * @fuction: about the role of class.
 */
public class ExcuteMultition {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            MultitionInstance multitionInstance=MultitionInstance.getInstance();
            System.out.println("第"+(i+1)+"次开始获取实例");
            multitionInstance.function();
        }
    }
}
