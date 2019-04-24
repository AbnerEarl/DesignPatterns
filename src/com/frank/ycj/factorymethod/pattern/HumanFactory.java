package com.frank.ycj.factorymethod.pattern;

import java.util.List;
import java.util.Random;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/4/7
 * @time: 16:18
 * @fuction: about the role of class.
 */
public class HumanFactory {
    public static Human createHuman(Class c){
        Human human=null;
        try {
            human= (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return human;
    }

    public static Human createHuman(){
        Human human=null;
        List<Class> allHumanList=ClassUtils.getAllClassByInterface(Human.class);
        Random random=new Random();
        int rand=random.nextInt(allHumanList.size());
        human=createHuman(allHumanList.get(rand));
        return human;
    }
}
