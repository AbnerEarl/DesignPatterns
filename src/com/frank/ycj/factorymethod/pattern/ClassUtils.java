package com.frank.ycj.factorymethod.pattern;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2019/4/7
 * @time: 16:28
 * @fuction: about the role of class.
 */
public class ClassUtils {
    //给一个接口，返回这个接口的所有实现类
    public static List<Class> getAllClassByInterface(Class c){
        List<Class> returnClassList = new ArrayList<Class>(); //返回结果
//如果不是一个接口，则不做处理
        if(c.isInterface()){
            String packageName = c.getPackage().getName(); //获得当前的包名
            try {
                List<Class> allClass = getClasses(packageName); //获得当前包下以及子包下的所有类
//判断是否是同一个接口
                for(int i=0;i<allClass.size();i++){
                    if(c.isAssignableFrom(allClass.get(i))){ //判断是不是一个接口
                        if(!c.equals(allClass.get(i))){ //本身不加进去
                            returnClassList.add(allClass.get(i));
                        }
                    }
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return returnClassList;
    }

    //给一个父类，返回这个父类的所有子类
    public static List<Class> getAllClassByParentClass(Class c){
        List<Class> returnClassList = new ArrayList<Class>(); //返回结果
//如果不是一个父类，则不做处理
        if(c.getSuperclass().isAssignableFrom(Object.class)){
            String packageName = c.getPackage().getName(); //获得当前的包名
            try {
                List<Class> allClass = getClasses(packageName); //获得当前包下以及子包下的所有类
//判断是否是同一个父类
                for(int i=0;i<allClass.size();i++){
                    if(c.isAssignableFrom(allClass.get(i))){ //判断是不是一个子类
                        if(!c.equals(allClass.get(i))){ //本身不加进去
                            returnClassList.add(allClass.get(i));
                        }
                    }
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return returnClassList;
    }


    //从一个包中查找出所有的类，在jar包中不能查找
    private static List<Class> getClasses(String packageName)
            throws ClassNotFoundException, IOException {
        ClassLoader classLoader = Thread.currentThread()
                .getContextClassLoader();
        String path = packageName.replace('.', '/');
        Enumeration<URL> resources = classLoader.getResources(path);
        List<File> dirs = new ArrayList<File>();
        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        ArrayList<Class> classes = new ArrayList<Class>();
        for (File directory : dirs) {
            classes.addAll(findClasses(directory, packageName));
        }
        return classes;
    }
    private static List<Class> findClasses(File directory, String packageName)
            throws ClassNotFoundException {
        List<Class> classes = new ArrayList<Class>();
        if (!directory.exists()) {
            return classes;
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." +
                        file.getName()));
            } else if (file.getName().endsWith(".class")) {
                classes.add(Class.forName(packageName + '.' +
                        file.getName().substring(0, file.getName().length() - 6)));
            }
        }
        return classes;
    }
}
