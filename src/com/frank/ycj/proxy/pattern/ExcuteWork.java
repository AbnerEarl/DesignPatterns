package com.frank.ycj.proxy.pattern;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/4/7
 * @time: 15:31
 * @fuction: about the role of class.
 */
public class ExcuteWork {
    public static void main(String[] args) {
        ProxyMan proxyMan=new ProxyMan();
        proxyMan.work();
        proxyMan.sing();

        ProxyMan proxyMan2=new ProxyMan(new DetailMan2());
        proxyMan2.work();
        proxyMan2.sing();
    }
}
