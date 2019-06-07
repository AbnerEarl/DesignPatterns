package com.frank.ycj.factorymethod.pattern;

import java.util.HashMap;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/6/7
 * @time: 13:28
 * @fuction: about the role of class.
 */
public class HumanFactoryForLazy {
    private static HashMap<String,Human> humanHashMap=new HashMap<>();
    public static Human createHuman(Class c){
        Human human=null;
        try {
            if (humanHashMap.containsKey(c.getSimpleName())){
                human=humanHashMap.get(c.getSimpleName());
            }else {
                human= (Human) Class.forName(c.getName()).newInstance();
                humanHashMap.put(c.getSimpleName(),human);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return human;
    }
}
