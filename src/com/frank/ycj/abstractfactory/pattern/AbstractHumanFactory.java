package com.frank.ycj.abstractfactory.pattern;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/6/7
 * @time: 13:52
 * @fuction: about the role of class.
 */
public abstract class AbstractHumanFactory implements HumanFactory {
    protected Human createHuman(HumanEnum humanEnum) {
        Human human = null;
        if (!humanEnum.getValue().equals("")){
            try {
                human= (Human) Class.forName(humanEnum.getValue()).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return human;
    }
}
