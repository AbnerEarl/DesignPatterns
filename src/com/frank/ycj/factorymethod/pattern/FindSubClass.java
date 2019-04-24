package com.frank.ycj.factorymethod.pattern;

import java.util.List;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/4/7
 * @time: 16:45
 * @fuction: about the role of class.
 */
public class FindSubClass {
    public static void main(String[] args) {
        List<Class> classList = ClassUtils.getAllClassByParentClass(ParentClass.class);
        for (Class c:classList){
            System.out.println(c.getName());
        }
    }
}
