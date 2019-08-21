package com.vanness.reflect;

import java.lang.reflect.Method;

public class TestMethodReflect {
    public static void main(String[] args) throws Exception{
        //获取Class对象
        Class classType = Class.forName("java.lang.String");

        Method[] methods = classType.getDeclaredMethods();
        for(Method method : methods) {
            System.out.println(method);
        }

        System.out.println("****************************");

        Method[] publicMethods = classType.getMethods();
        for (Method method : publicMethods) {
            System.out.println(method);
        }



    }
}
