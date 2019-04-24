package com.frank.ycj.proxy.pattern;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/4/7
 * @time: 15:27
 * @fuction: about the role of class.
 */
public class ProxyMan implements KindMan {
    private KindMan kindMan;

    public ProxyMan(){
        this.kindMan=new DetailMan1();
    }

    public ProxyMan(KindMan kindMan) {
        this.kindMan = kindMan;
    }

    @Override
    public void work() {
        this.kindMan.work();
    }

    @Override
    public void sing() {
        this.kindMan.sing();
    }
}
