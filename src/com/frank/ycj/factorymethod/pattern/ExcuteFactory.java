package com.frank.ycj.factorymethod.pattern;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/4/7
 * @time: 16:22
 * @fuction: about the role of class.
 */
public class ExcuteFactory {
    public static void main(String[] args) {
        Human whiteHuman=HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.color();
        whiteHuman.laugh();

        Human blackHuman=HumanFactory.createHuman(BlackHuman.class);
        blackHuman.color();
        blackHuman.laugh();

        Human yellowHuman=HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.color();
        yellowHuman.laugh();
        

        for (int i=0;i<10;i++){
            Human human=HumanFactory.createHuman();
            human.color();
            human.laugh();
        }
    }
}
