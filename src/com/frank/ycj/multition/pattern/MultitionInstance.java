package com.frank.ycj.multition.pattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/4/7
 * @time: 15:55
 * @fuction: about the role of class.
 */
public class MultitionInstance {
    private static int maxNumOfInstance=2;
    private static ArrayList instanceList=new ArrayList(maxNumOfInstance);
    private static ArrayList functionList=new ArrayList(maxNumOfInstance);
    private static int countNumOfInstance=0;

    static {
        for (int i=0;i<maxNumOfInstance;i++){
            instanceList.add(new MultitionInstance("第"+(i+1)+"个实例。"));
        }
    }

    private MultitionInstance(){

    }

    private MultitionInstance(String funName){
        functionList.add(funName);
    }

    public static MultitionInstance getInstance(){
        Random random=new Random();
        countNumOfInstance=random.nextInt(maxNumOfInstance);
        return (MultitionInstance) instanceList.get(countNumOfInstance);
    }

    public static void function(){
        System.out.println(functionList.get(countNumOfInstance));
    }
}
